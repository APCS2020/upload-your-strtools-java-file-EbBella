public class StrTools{
    public static String changeFirstChar(String str){
        // String remainedStr = str.substring(1);
        // String firstChar = str.substring(0,1);
        // return firstChar.toUpperCase() + remainedStr;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    public static String addPeriod(String str){
        return str + ".";
    }

    // replace a target word with a given word
    public static String replace(String str, String target, String repl){
        int firstIndex = str.indexOf(target);
        int secondIndex = firstIndex + target.length();
        String firstPart = str.substring(0, firstIndex);
        String secondPart = str.substring(secondIndex);
        return firstPart + repl + secondPart;

    }

    // print single character of a string
    // "abcd" return "a, b, c, d."
    public static String printSingleChar(String str){
        int index = 0;
        String tmp = "";
        while (index < str.length()-1){
        tmp += str.substring(0,1);
        tmp += ",";
        tmp += " ";
        }
        return tmp + str.substring(str.length()-1) + ".";
    }

    public static void main(String[] args) {
        String str = "he";// change the first character 'h'
        String tmp = changeFirstChar(str);// tmp "He"
        System.out.println(tmp);

        String begining = "I miss you.";
        String after = replace(begining, "miss", "missed");
        System.out.println(after);
    }

     // method: Reverse
     public static String reverse(String str){
        String reverseStr = "";
        for(int i = str.length()-1; i>=0; i--){
            reverseStr += str.substring(i,i+1);
        }
        return reverseStr;
    }

    public static String parliWord(String str){
        return str + reverse(str);
    }

    public static String parlidrom(String str){
        String tmp = "";
        if(str.length()%2==0){
            tmp = str.substring(0,str.length()/2);
        }
        else{
            tmp = str.substring(0,str.length()/2+1);
        }
        return tmp + reverse(tmp);
    }

    public static boolean isPali(String str){
        /**
         * public 这是一个用来说明方法访问范围的关键字
         * public的方法可以在client program里访问
         * static：静态方法关键字
         * 此方法可以直接用className.methodName()调用
         * boolean：这是返回值类型return type
         * isPali：MethodName
         * String str：Parameter type
         */
        String half = str.substring(0,str.length()/2);
        String secondHalf = "";
        if (str.length()%2==0){
            secondHalf = str.substring(str.length()/2,str.length());
        }
        else{
            secondHalf = str.substring(str.length()/2+1);
        }
        return reverse(secondHalf).equals(half);//true or false
    }

    public static boolean checkParlidrom(String str){
        String tmp = "";
        String newStr = "";
        if (str.length()%2==0){
            tmp = str.substring(0,str.length()/2);
            newStr = tmp + reverse(tmp);
        }
        else{
            tmp = str.substring(0,str.length()/2);
            newStr = tmp + str.substring(str.length()/2, str.length()/2+1) + reverse(tmp);
        }
        return newStr.equals(str);
    }
}