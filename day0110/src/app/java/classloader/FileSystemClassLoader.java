package app.java.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * 自定义类加载器
 *  * 继承于ClassLoader类.
 *  * 重写findClass()
 * @author JYL
 *
 */
public class FileSystemClassLoader extends ClassLoader {

	private String rootDir;
	/**
	 * FileSystemClassLoader的构造函数接收绝对路径.
	 */
	public FileSystemClassLoader(String rootDir) {
		this.rootDir = rootDir;
	}
	/**
	 * 重写于ClassLoader类的findClass()方法.
	 */
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		byte[] classData = getClassData(name);
		if (classData == null) {
			// Class未找到异常.
			throw new ClassNotFoundException();
		}
		else {
			// defineClass()方法是由ClassLoader类提供的.
			// defineClass()方法的作用就是通过字节数组获取对应的Class实例.
			return defineClass(name, classData, 0, classData.length);
		}
	}
	/**
	 * getClassData()方法:
	 *  * 通过Class的类名,读取指定Class文件的内容.
	 */
	private byte[] getClassData(String className) {
		// 通过Class类名,查找对应Class文件的路径.
		String path = classNameToPath(className);
		try {
			// 通过Class文件的路径,获取文件输入流.
			InputStream ins = new FileInputStream(path);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int bufferSize = 4096;
			byte[] buffer = new byte[bufferSize];
			int bytesNumRead = 0;
			while ((bytesNumRead = ins.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesNumRead);
			}
			return baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * classNameToPath()
	 *  * 通过Class的类名,查找指定Class文件的路径.
	 */
	private String classNameToPath(String className) {
		return rootDir + File.separatorChar
				+ className.replace('.', File.separatorChar) + ".class";
	}

}
