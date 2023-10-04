import javax.swing.JOptionPane;
import java.lang.Exception;
import java.io.File;
import java.io.FilenameFilter;
class SuffixFilename implements FilenameFilter
{
	private String type;
    SuffixFilename(String s)
	{
		this.type = s;
	}
	public boolean accept(File f, String path)
	{
	File file=new File(path);
	String filename=file.getName();
	return filename.indexOf(type)!=-1;
    }
}
public class App_4
{
	public static void main(String[] args)
	{
		String name = "D:/Course/Java/Java_program/code1";
		File f = new File(name);
		try
		{
		FilenameFilter filter = new SuffixFilename(".java");
		if(f.isDirectory())
		{
         JOptionPane.showMessageDialog(null,"Directory","Directory",JOptionPane.PLAIN_MESSAGE);
         String[] fileList = f.list(filter);
         for(int i=0;i<fileList.length;i++)
         JOptionPane.showMessageDialog(null,fileList[i], "FileName", JOptionPane.PLAIN_MESSAGE);
		}
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	}
}