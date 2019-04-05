package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DemoUtil {

   public List<Demo> getDemos() {
	   List<Demo> list = Arrays.asList(new Demo(1,"demo-1","ok"),
			             new Demo(2,"demo-2","ok"),
			             new Demo(3,"demo-3","ok"),
			             new Demo(4,"demo-4","ok"),
			             new Demo(5,"demo-5","ok"));
	   return list;
   }

}
