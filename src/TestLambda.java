import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    public static List<Apple> filterApplesByAppleFilter(List<Apple> apples,AppleFilter filter){
        List<Apple> filterApples = new ArrayList<>();
        for(final Apple apple : apples){
            if(filter.accept(apple))
                filterApples.add(apple);
        }
        return filterApples;
    }



    public static void main(String[] args){
        List<Apple> apples = new ArrayList<>();

        List<Apple> filterApples = filterApplesByAppleFilter(apples, new AppleFilter() {
            @Override
            public boolean accept(Apple apple) {
                return Color.RED.equals(apple.getColor()) && apple.getWeight()>100;
            }
        });


        List<Apple> filterApples2 = filterApplesByAppleFilter(apples,(Apple apple)->Color.RED.equals(apple.getColor())&&apple.getWeight()>100);


    }
}
