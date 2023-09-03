class ReverseString
{
    public static void main(String[] args)
    {
        String originalString = "Hello";
        String reverseString = "";
        for(int i = 0; i < originalString.length(); i++)
        {            
            reverseString = originalString.charAt(i) + reverseString;
        }
        System.out.println("Reversed String: " + reverseString);
    }
}