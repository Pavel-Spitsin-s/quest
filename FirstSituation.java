public class FirstSituation extends Situation {
    private String text = "";
    private int number_of_responses;
    private String image_filename;


    @Override
    public void Situation() {
        System.out.println(text); // вывод текста в актвность
        this.number_of_responses = number_of_responses; // выбор активности по количеству кнопок
        this.image_filename = image_filename; // вывод картинки по имени файла
    }
}
