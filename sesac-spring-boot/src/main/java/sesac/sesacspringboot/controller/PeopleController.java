package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.ui.Model;

@Controller
public class PeopleController {
    class Person {
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }

    }
    @GetMapping("/people")
    public String getPeople(Model model) {
        List<Person>people = new ArrayList<>();
        people.add(new Person("kim", 10));
        people.add(new Person("lee", 20));
        people.add(new Person("hone", 33));
        people.add(new Person("park", 41));
        model.addAttribute("people", people);

        return "people";
    }

}
