import java.nio.channels.FileLockInterruptionException;
import java.util.concurrent.TimeUnit;

public class Image implements Element
{
    public String imageName;

    public Image( String ImageName)
    {
        this.imageName=ImageName;
        try{
            TimeUnit.SECONDS.sleep(5);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void print()
    {
        System.out.println("Image with name:" + imageName);
    }
}
