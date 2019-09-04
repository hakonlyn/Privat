package assignment2;

import java.io.*;
import java.util.*;

import javax.print.event.PrintJobListener;
import com.google.common.collect.BiMap;


public class ImageLabelReader {
	// BidiMap<String, String> imageMap = new DualHashBidiMap<>();
	BiMap<String, String> imageMap = HashBiMap.create();
	public static void main(String[]args){

	}

	public ImageLabelReader(String labelMappingFile, String imageMappingFile) {
		try{
			Scanner lableScanner = new Scanner(new File(labelMappingFile));
			Scanner imageScanner = new Scanner(new File(imageMappingFile));

			while (imageScanner.hasNextLine()){
				Array imageLine =imageScanner.nextLine().split(" ");
				String image = imageLine[0];
				String imagefileLable = imageLine[1];
				// System.out.println(line);
				// System.out.println(line.split(" ")[0]);
				// System.out.println();
				while (lableScanner.hasNextLine()){
					Array lableLine =lableScanner.nextLine().split(" ");
					String lableNumber = lableLine[0];
					String lable = lableLine[1];

					if (imagefileLable == lableNumber){
						this.imageMap.put(image, lable);
					}

					// System.out.println(line);
					// System.out.println(line.split(" ")[0]);
					// System.out.println(line.split(" ")[1]);
				}
				imageScanner.close();
			}
			imageScanner.close();

			

		}	
		catch (FileNotFoundException e){
			System.out.println("Klikka ass");
		}
	}
     	
	//Given an image file get it's label
	//Note that each image has a single label
	//If the given image file is not found return null
	public String getLabel(String imageFileName){
		return this.imageMap.getKey(imageFileName);
	}
	
	//Given a label get all the image files corresponding to this label
	//Note that there could be multiple images for a given label
	//If the given label is not found return null
	public String[] getImageFiles(String label){
		return null;
	
	}
	
}