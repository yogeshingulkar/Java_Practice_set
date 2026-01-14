class CommandLineArgument1{
   public static void main(String[] args){
        if (args.length == 0) return;

        String name = args[0];
        String reverse = "";

        for(int i = name.length()-1; i>= 0; i--) 
            reverse += name.charAt(i);

        if(name.equalsIgnoreCase(reverse)) System.out.println(name + " : Palindrome");
        else System.out.println(name + " : Not Palindrome");
    }
}