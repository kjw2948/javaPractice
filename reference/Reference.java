package reference;

import class1.Student;

public class Reference {
    // 기본형 대입
    int a = 10; // 메모리에 a가 생기고 그곳에 10이 저장됨
    int b = a; // 메모리에 b가 생기고 그곳에 a에 저장되어있는 10이 저장됨 -> a, b에 각각 10이 저장됨

    // 참조형 대입
    Student s1 = new Student(); // 메모리상에 Student 객체가 생성되고 s1에는 객체로 이동하기 위한 참조값이 저장됨
    Student s2 = s1; // s2에는 s1에 들어있는 참조값이 저장됨 -> 즉 Student 객체는 하나만 존재하고 객체로 찾아가기 위한 s1, s2라는 2개의 길이 생기는거임
    // 객체를 새로 추가하고 싶다면 new 라는 키워드를 통해 생성해줘야함!

}
