package dev.ananda.utils;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesUtility {
	
	private FilesUtility(){}
	
	private static String getResourceFolderPath(){
		Path root = FileSystems.getDefault().getPath("").toAbsolutePath();
		String path = root.toString() + "/application_problems/src/main/resources/";
		return path;
	}
	
	public static List<String> getAllLines(String path) throws IOException{
		return Files.readAllLines(Paths.get(getResourceFolderPath()+path));
	}

}
