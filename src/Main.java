import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Welcome
//        welo
        System.out.println("Nhập vào chuỗi cần tìm kiếm");
        String string = new Scanner(System.in).nextLine();
        System.out.println(string.length());
//        List<Character> listCharacters = new ArrayList<>();
//        for (int i = 0; i < string.length(); i++) {
//            List<Character> listTemp = new ArrayList<>();
//            listTemp.add(string.charAt(i));
//            for (int j = i+1; j < string.length(); j++) {
//                if(string.charAt(j) > listTemp.get(listTemp.size()-1)){
//                    listTemp.add(string.charAt(j));
//                }
//            }
//            if(listTemp.size()> listCharacters.size()){
//                listCharacters.clear();
//                listCharacters.addAll(listTemp);
//            }
//        }
//        String result = "";
//        for (Character c:listCharacters
//             ) {
//            result += c;
//        }
//        System.out.println(result);
        String maxLenght = "";
        Character max;
        for (int i = 0; i < string.length()-1; i++) {
            if (maxLenght.length()>=string.length() - i){
                break;
            }
            System.out.println(i);
            String temp = String.valueOf(string.charAt(i));
            max = string.charAt(i);
            for (int j = i+1; j < string.length(); j++) {
                if(max<string.charAt(j)){
                    max = string.charAt(j);
                    temp += string.charAt(j);
                }
            }
            if(temp.length() > maxLenght.length()){
                maxLenght= temp;
            }
        }
        System.out.println(maxLenght);
    }
}