package assignment2;

import java.io.*;
import java.util.*;

import javax.print.event.PrintJobListener;

public class ImageLabelReader {
	HashMap<String, String> lableMap = new HashMap<String, String>();
	HashMap<String, String> imageMap = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println("Constructor");
	}

	public ImageLabelReader(String labelMappingFile, String imageMappingFile) {
		try {
			Scanner lableScanner = new Scanner(new File(labelMappingFile));
			Scanner imageScanner = new Scanner(new File(imageMappingFile));

			while (lableScanner.hasNextLine()) {
				String[] lableLine = lableScanner.nextLine().split(" ", 2);
				String lableNumber = lableLine[0];
				String lable = lableLine[1];
				this.lableMap.put(lableNumber, lable);
			}
			lableScanner.close();

			while (imageScanner.hasNextLine()) {
				String[] imageLine = imageScanner.nextLine().split(" ", 2);
				String image = imageLine[0];
				String imageLableNumber = imageLine[1];
				this.imageMap.put(image, this.lableMap.get(imageLableNumber));
			}
			imageScanner.close();

			// System.out.println(this.imageMap);
		} catch (FileNotFoundException e) {
			System.out.println("Klikka ass");
		}
	}

	// Given an image file get it's label
	// Note that each image has a single label
	// If the given image file is not found return null
	public String getLabel(String imageFileName) {
		// System.out.println(this.imageMap.get(imageFileName));
		return this.imageMap.get(imageFileName);
	}

	// Given a label get all the image files corresponding to this label
	// Note that there could be multiple images for a given label
	// If the given label is not found return null
	public String[] getImageFiles(String label) {
		List<String> files = new ArrayList<String>(16);
		this.imageMap.forEach((k, val)->{
			if(val.equals(label)){
				files.add(k);
			}
		});
		return files.toArray(new String[files.size()]);
	}

}