public class box_m_i_m extends facade_file
{
    public int width;
    public int height;
    public int length;

    public box_m_i_m(int height, int width, int length )
    {
        this.height = height;
        this.length = length;
        this.width  = width;
    }

    public int  volume()
    {
        return width * height * length;
    }

    public void show_volume()
    {
        System.out.println(volume());
    }

}
