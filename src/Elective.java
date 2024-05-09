public class Elective {
    private String name;
    private int maxCapacity;
    private int currentCapacity;

    public Elective(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public Elective() {
        // Порожній конструктор
    }

    public void selectVolunteering() {
        int maxVolunteers = 27;
        int currentVolunteers = 26;

        if (currentVolunteers < maxVolunteers) {
            System.out.println("Ви успішно приєдналися до дисципліни \"Волонтерська діяльність\".");
            System.out.println("Максимальна кількість учасників: " + maxVolunteers);
            int cap = currentVolunteers + 1;
            System.out.println("Поточна кількість учасників: " + cap);
            System.out.println("Залишилось місць: " + (maxVolunteers - cap));
        } else {
            System.out.println("Дисципліна \"Волонтерська діяльність\" вже має " + currentVolunteers + " учасників і більше не приймає нових.");
            System.out.println("Максимальна кількість учасників: " + maxVolunteers);
            System.out.println("Поточна кількість учасників: " + currentVolunteers);
            System.out.println("Немає вільних місць.");
        }
    }

    public void selectRhetoric() {
        int maxRhetoricCapacity = 27;
        int currentRhetoricCapacity = 22;

        if (currentRhetoricCapacity < maxRhetoricCapacity) {
            System.out.println("Ви успішно приєдналися до дисципліни \"Риторика\".");
            System.out.println("Максимальна кількість учасників: " + maxRhetoricCapacity);
            int cap = currentRhetoricCapacity + 1;
            System.out.println("Поточна кількість учасників: " + cap);
            System.out.println("Залишилось місць: " + (maxRhetoricCapacity - cap));
        } else {
            System.out.println("Дисципліна \"Риторика\" вже має " + currentRhetoricCapacity + " учасників і більше не приймає нових.");
            System.out.println("Максимальна кількість учасників: " + maxRhetoricCapacity);
            System.out.println("Поточна кількість учасників: " + currentRhetoricCapacity);
            System.out.println("Немає вільних місць.");
        }
    }

    public void selectCriticalThinking() {
        int maxCriticalThinkingCapacity = 27;
        int currentCriticalThinkingCapacity = 12;

        if (currentCriticalThinkingCapacity < maxCriticalThinkingCapacity) {
            System.out.println("Ви успішно приєдналися до дисципліни \"Критичне мислення\".");
            System.out.println("Максимальна кількість учасників: " + maxCriticalThinkingCapacity);
            int cap = currentCriticalThinkingCapacity + 1;
            System.out.println("Поточна кількість учасників: " + cap);
            System.out.println("Залишилось місць: " + (maxCriticalThinkingCapacity - cap));
        } else {
            System.out.println("Дисципліна \"Критичне мислення\" вже має " + currentCriticalThinkingCapacity + " учасників і більше не приймає нових.");
            System.out.println("Максимальна кількість учасників: " + maxCriticalThinkingCapacity);
            System.out.println("Поточна кількість учасників: " + currentCriticalThinkingCapacity);
            System.out.println("Немає вільних місць.");
        }
    }

    public void selectEnglishLanguage() {
        int maxEnglishCapacity = 27;
        int currentEnglishCapacity = 27;

        if (currentEnglishCapacity < maxEnglishCapacity) {
            System.out.println("Ви успішно приєдналися до дисципліни \"Англійська мова\".");
            System.out.println("Максимальна кількість учасників: " + maxEnglishCapacity);
            int cap = currentEnglishCapacity + 1;
            System.out.println("Поточна кількість учасників: " + cap);
            System.out.println("Залишилось місць: " + (maxEnglishCapacity - cap));
        } else {
            System.out.println("Дисципліна \"Англійська мова\" вже має " + currentEnglishCapacity + " учасників і більше не приймає нових.");
            System.out.println("Максимальна кількість учасників: " + maxEnglishCapacity);
            System.out.println("Поточна кількість учасників: " + currentEnglishCapacity);
            System.out.println("Немає вільних місць.");
        }
    }
}
