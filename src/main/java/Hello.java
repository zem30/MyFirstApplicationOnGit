import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Hello {

    private String name;

    public static void main(String[] args) {



        System.out.println("Hello world");

        Hello qwe = new Hello();

        Hello qwe1 = new Hello("Qasd");

        var asd = Hello.builder()
                .name("qew")
                .build();

        qwe.getName();
    }
}
