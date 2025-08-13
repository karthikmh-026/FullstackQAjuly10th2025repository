class Arraydemo5 
{
    public static void main(String[] args) 
     {
        double[] data = {10.5, 20.2, 30.3, 40.4, 50.5, 60.6}; 

        int start = data.length / 2;
        for (int i = data.length - 1; i >= start; i--) 
        {
            System.out.println(data[i]);
        }
    }
}
