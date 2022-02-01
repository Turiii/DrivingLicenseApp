package manager.data;


import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicPartOfTest {
    private List<Question> basic_test;
    private List<Question> firstList;
    private List<Question> secondList;
    private List<Question> thirdList;

    public BasicPartOfTest(List<Question> allBasicQuestions) {
        this.basic_test = Stream.of(firstList,secondList,thirdList).flatMap(Collection::stream).collect(Collectors.toList());
    }

    private List<Question> generateFirst(List<Question> listByType){
        return listByType.stream()
                .filter(question -> question.getWartosc() == 3)
                .limit(10)
                .collect(Collectors.toList());
    }
    private List<Question> generateSecond(List<Question> listByType){
        return listByType.stream()
                .filter(question -> question.getWartosc() == 2)
                .limit(6)
                .collect(Collectors.toList());
    }
    private List<Question> generateThird(List<Question> listByType){
        return listByType.stream()
                .filter(question -> question.getWartosc() == 1)
                .limit(4)
                .collect(Collectors.toList());
    }


    public List<Question> getBasic_test() {
        return basic_test;
    }

}
