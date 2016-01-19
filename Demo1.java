package test.guawa;

import java.util.Arrays;
import java.util.List;

/**
 * Created by shengchao wu on 1/13/2016.
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"aaa","bbb","ccc"});
        String result = BuildString.buildString(list,",");
        System.out.print(result);
		
		System.out.print("haha");
    }
}
