 class Arraydemo7 
{
    public static void main(String[] args) 
       {
        char[] letters = {'J', 'A', 'V', 'A'};

        String result = "";

  
        for (int i = letters.length - 1; i >= 0; i--) 
        {
            result += letters[i];
        }

        System.out.println("Concatenated reverse string: " + result);
    }
}
