public class Password {

    void validate_pass(String str){
        boolean uppercase = false;
        boolean lowercase = false;
        boolean num = false;
        boolean spchar = false;



        for(int i = 0 ; i<str.length(); i++){

            try {


                if (Character.isUpperCase(str.charAt(i))) {
                    uppercase = true;
                }

                if (Character.isLowerCase(str.charAt(i))) {
                    lowercase = true;
                }

                if (Character.isDigit(str.charAt(i))) {

                    num = true;

                }


                if ((str.charAt(i)) == '@' || (str.charAt(i)) == '*' || (str.charAt(i)) == '#'
                        || (str.charAt(i)) == '&' || (str.charAt(i)) == '%' || (str.charAt(i)) == '!') {

                    spchar = true;
                }

            } catch (Exception e) {
                System.out.println("its an exception");
            }




        }


        if((uppercase == true) && (lowercase == true) &&(num == true)
                &&(spchar == true)  ){

            System.out.print("Valid Pass");
        }

        else {
            System.out.print("Inavlid pass");
        }







    }


    public static void main(String[] args) {

        Password obj = new Password();
        obj.validate_pass("program#7");

    }




}
