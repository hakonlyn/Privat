package assignment2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ImageLabelReaderTest {
	 @Test public void testLabelFiles() {
		 ImageLabelReader ilr = new ImageLabelReader("data/label_mapping.csv", "data/image_mapping.csv");
		 String[] files = ilr.getImageFiles("goldfish");
		 assertNotNull(files);
		//  assertEquals(files.length, 10);		 
	 }
	 
	//  @Test public void testImageLabel() {
	// 	 ImageLabelReader ilr = new ImageLabelReader("data/label_mapping.csv", "data/image_mapping.csv");
	// 	 String label = ilr.getLabel("ILSVRC2012_val_00000090.JPEG");
	// 	 assertNotNull(label);
	// 	 assertEquals(label, "American alligator");		 
	//  }
}
