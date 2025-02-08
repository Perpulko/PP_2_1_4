package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    public String toString() {
        return "Im a Dog";
    }
}
