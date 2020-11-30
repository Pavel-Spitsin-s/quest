public class FirstSituation extends Situation {
    private String text = ""; // Текст текущей ситуации
    private int number_of_responses = 2; // Количество ответов
    private String image_filename = ""; // Имя файла с картинкой для текущей ситуации


    @Override
    public void Situation() {
        System.out.println(text); // вывод текста в актвность
        this.number_of_responses = number_of_responses; // выбор активности по количеству кнопок
        this.image_filename = image_filename; // вывод картинки по имени файла
    }

    @Override
    public int getAnswer() {
        // должен получать число от 0 до 3 с активности в зависимости от выбранного ответа
        int k = 1; // пусть пока это будет 1
        return k;

    }
}
