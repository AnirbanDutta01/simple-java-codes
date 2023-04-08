//copying characters from one file into another
import java.io.*;
class CopyCharacters{
	public static void main(String[]args){
		File inFile=new File("input.dat");	//input.dat file    file inbuilt 
		File outFile=new File("output.dat");//output.dat file
		FileReader ins=null;//reference
		FileWriter outs=null;
		try{
			ins = new FileReader(inFile);
			outs= new FileWriter(outFile);
			int ch;
			while((ch=ins.read())!=-1){		//.read used to read and .write for writing ...inbuilt function
				outs.write(ch);
			}
		}
		catch(IOException e){
			System.out.println(e);		// e for throwing inbuilt exception message by compiler
			System.exit(-1);
		}
		finally{
				try{
					ins.close();
					outs.close();
				}
				catch(IOException e){}
		}
	}
}
