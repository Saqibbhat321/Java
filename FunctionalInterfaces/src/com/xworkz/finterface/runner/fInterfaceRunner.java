package com.xworkz.finterface.runner;

import com.xworkz.finterface.functionalinterface.Consumer;

import java.util.function.*;

public class fInterfaceRunner {


    public static void main(String[] args) {


        Consumer<String> consumer = (ref) -> System.out.println(ref);

        BiConsumer<Integer, Integer> biConsumer = (ref1, ref2) -> {
            System.out.println(ref1 + " " + ref2);
        };

        Supplier<String> supplier = () -> {
            System.out.println("suppplier functional interface");

            return "get method";
        };
        //4

        Function<Integer, String> function = (i) -> {
            System.out.println("recieved " + i);
            return String.valueOf(i);
        };
        //5

        BiFunction<Integer, Integer, String> biFunction = (age, id) -> {
            System.out.println("age " + age);
            System.out.println("id " + id);
            return "details";
        };

        Predicate<Boolean> predicate = (i) -> {
            return true;
        };

        BiPredicate<Integer,Integer> biPredicate = (i,h)->{
            System.out.println("BiPredicate interface");
            return i>h;
        };

        //8
        UnaryOperator<String> unaryOperator=(name)->
        {
            System.out.println(name);
           return "saqib";
        };
        String ref = unaryOperator.apply("SAQIB");
        System.out.println(ref);


        //9
        BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
                int number = binaryOperator.apply(500, 550);
                System.out.println(number);
                System.out.println("---------------");

                // 10
                IntConsumer consumer1 = (int value) -> {
                    System.out.println("Accept in lambda runner : " + value);
                };

                // 11
                IntSupplier intSupplier = () -> {
                    System.out.println("IntSupplier Method");
                    return 50;
                };
                int value = intSupplier.getAsInt();
                System.out.println(value);
                System.out.println("---------------");

                // 12
                IntFunction<String> intFunction = (val) -> {
                    System.out.println("IntFunction method");
                    String fun = "The value is: " + val;
                    return fun;
                };
                System.out.println(intFunction.apply(10)); // Outputs: The value is: 10
                System.out.println("---------------");

                // 13
                IntPredicate intPredicate = (int score) -> {
                    System.out.println("intPredicte method");
                    System.out.println(score);
                    return true;
                };
                boolean check = intPredicate.test(500);
                System.out.println(check);
                System.out.println("---------------");

                // 14
                IntUnaryOperator intUnary = (int operand) -> {
                    System.out.println("IntUnaryOperator method");
                    System.out.println(operand);
                    return operand;
                };
                intUnary.applyAsInt(600);
                System.out.println("---------------");

                // 15
                IntBinaryOperator intBinary = (left, right) -> {
                    System.out.println("left value :" + left);
                    System.out.println("right value :" + right);
                    return left;
                };
                intBinary.applyAsInt(200, 150);
                System.out.println("---------------");

                // 16
                LongConsumer longConsumer = (accountNo) -> {
                    System.out.println("LongConsumer method");
                    System.out.println("Account No: " + accountNo);
                };
                longConsumer.accept(3697122456L);
                System.out.println("--------------");

                // 17
                LongSupplier longSupplier = () -> {
                    System.out.println("LongSupplier method");
                    return 123456789L;
                };
                longSupplier.getAsLong();
                System.out.println("---------------");

                // 18
                LongFunction<String> longFunction = (population) -> {
                    System.out.println("LongFunction method");
                    System.out.println("India Population :" + population);
                    return "India";
                };
                longFunction.apply(1380004385L);
                System.out.println("--------------");

                // 19
                LongPredicate longPredicate = (store) -> {
                    System.out.println("Long predicate method");
                    System.out.println("Stored Data :" + store);
                    return false;
                };
                longPredicate.test(83992949L);
                System.out.println("----------------");

                // 20
                LongUnaryOperator longUnaryOperator = (phone) -> {
                    System.out.println("PhoneNo: " + phone);
                    return phone;
                };
                longUnaryOperator.applyAsLong(822341778L);
                System.out.println("----------------");

                // 21
                LongBinaryOperator longBinary = (binary, Binary) -> {
                    System.out.println(binary);
                    System.out.println(Binary);
                    return binary;
                };
                longBinary.applyAsLong(822341778L, 83992949L);
                System.out.println("-----------------");

                // 22
                DoubleConsumer doubleConsumer = (price) -> {
                    System.out.println("double Consumer method");
                };
                doubleConsumer.accept(1000);
                System.out.println("----------------");

                // 23
                DoubleSupplier doubleSupplier = () -> {
                    System.out.println("Double supplier method");
                    return 1000;
                };
                doubleSupplier.getAsDouble();
                System.out.println("----------------");

                // 24
                DoubleFunction<String> doubleFunction = value5 -> "Double value: " + value5;
                System.out.println(doubleFunction.apply(10.5));
                System.out.println("---------------");

                // 25
                DoublePredicate doublePredicate = (double cost) -> {
                    System.out.println(cost);
                    return true;
                };
                doublePredicate.test(120);
                System.out.println("---------------");

                // 26
                DoubleUnaryOperator doubleUnaryOperator = (operand) -> {
                    System.out.println(operand);
                    return 300;
                };
                doubleUnaryOperator.applyAsDouble(400);
                System.out.println("---------------");

                // 27
                DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
                System.out.println("DoubleBinaryOperator result: " + doubleBinaryOperator.applyAsDouble(2.0, 3.0));
                System.out.println("---------------");

                // 28
                ToIntFunction<String> toIntFunction = str -> str.length();
                System.out.println("ToIntFunction length: " + toIntFunction.applyAsInt("Hello"));
                System.out.println("---------------");

                // 29
                ToDoubleFunction<String> toDoubleFunction = str -> str.length() * 1.0;
                System.out.println("ToDoubleFunction length: " + toDoubleFunction.applyAsDouble("Hello"));
                System.out.println("---------------");

                // 30
                ToLongFunction<String> toLongFunction = str -> str.length();
                System.out.println("ToLongFunction length: " + toLongFunction.applyAsLong("Hello"));
                System.out.println("---------------");

                // 31
                ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> (s1 + s2).length();
                System.out.println("ToIntBiFunction combined length: " + toIntBiFunction.applyAsInt("Hello", "World"));
                System.out.println("---------------");

                // 32
                ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> (a + b) / 2.0;
                System.out.println("ToDoubleBiFunction average: " + toDoubleBiFunction.applyAsDouble(10, 20));
                System.out.println("---------------");

                // 33
                ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> a + b;
                System.out.println("ToLongBiFunction sum: " + toLongBiFunction.applyAsLong(10, 20));
                System.out.println("---------------");

                // 34
                ObjIntConsumer<Integer> objInt = (size, quantity) -> {
                    System.out.println("ObjIntConsumer method");
                    System.out.println(size);
                    System.out.println(quantity);
                };
                objInt.accept(5, 2);
                System.out.println("---------------");

                // 35
                ObjDoubleConsumer<String> objDouble = (name, exp) -> {
                    System.out.println("Name : " + name);
                    System.out.println("Experience :" + exp);
                };
                objDouble.accept("osama", 2);
                System.out.println("---------------");

                // 36
                ObjLongConsumer<String> objLong = (name, mobileNumber) -> {
                    System.out.println("Name :" + name);
                    System.out.println("Mobile :" + mobileNumber);
                };
                objLong.accept("objlongcosumer", 9655922709L);
                System.out.println("----------------");

                // 37
                IntToDoubleFunction intToDouble = (int currentYear) -> {
                    System.out.println(currentYear);
                    return currentYear;
                };
                intToDouble.applyAsDouble(2024);
                System.out.println("---------------");

                // 38
                IntToLongFunction intToLong = (int pastYear) -> {
                    System.out.println("Past Year :" + pastYear);
                    return 867362820L;
                };
                intToLong.applyAsLong(2023);
                System.out.println("----------------");

                // 39
                DoubleToIntFunction doubleToInt = (double d) -> {
                    System.out.println(d);
                    return 2;
                };
                doubleToInt.applyAsInt(150);
                System.out.println("----------------");

                // 40
                LongToIntFunction longToIntFunction = (assign) -> (int) assign;
                System.out.println("LongToIntFunction: " + longToIntFunction.applyAsInt(10000L));
                System.out.println("----------------");

                // 41
                DoubleToLongFunction doubleToLongFunction = (toLong) -> (long) toLong;
                System.out.println("DoubleToLongFunction: " + doubleToLongFunction.applyAsLong(3.14));
                System.out.println("----------------");

                // 42
                LongToDoubleFunction longToDoubleFunction = (toDouble) -> toDouble / 2.0;
                System.out.println("LongToDoubleFunction: " + longToDoubleFunction.applyAsDouble(10000L));
                System.out.println("----------------");

                // 43
                // IntStream intStream=()->{
                // IntSteam is a class, not a Functional interface.

            }

        }

