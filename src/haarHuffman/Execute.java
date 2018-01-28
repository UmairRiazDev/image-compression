package haarHuffman;

public class Execute {

	public static void main(String[] args) {
		
		//Please define this variables before executing the algorithm.
		String directoryInput = "";
		String directoryOutput = "";
		String fileOutputExtension = ".out";
		/*Example: 
		 * directoryInput = "/home/user/Pictures/";
		 * directoryOutput = "/home/user/Output/";
		 */
		String filename = "sample-image"; //Image file name for processing
		//Currently Lossless Supported: PNG
		String extension = ".png";
			
		//Encoding	
		new MainAlgorithm(directoryInput+filename+extension, directoryOutput+filename+fileOutputExtension, "encoding");
			
		//Decoding
		new MainAlgorithm(directoryOutput+filename+fileOutputExtension, directoryOutput+filename);

	}

}
 