package day44_map_and_function.functional_interface_intro;
//<E> ---Generic - meaning that you can use any Object data type
//T is another name
@FunctionalInterface
public interface DynamicFunctionalInterface <T>{
    void test(T t);
}
