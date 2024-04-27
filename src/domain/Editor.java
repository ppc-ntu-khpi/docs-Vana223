package src.domain;

/**
 * Представляє сутність редактора, яка є підкласом класу Artist.
 */
public class Editor extends Artist {

    /**
     * Створює нового редактора з вказаними налаштуваннями редагування, навичками, ім'ям, посадою, рівнем та відділом.
     *
     * @param electronicEditing чи підтримує редактор електронне редагування
     * @param skills            навички редактора
     * @param name              ім'я редактора
     * @param jobTitle          посада редактора
     * @param level             рівень редактора
     * @param dept              відділ редактора
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з вказаними налаштуваннями редагування та навичками.
     *
     * @param electronicEditing чи підтримує редактор електронне редагування
     * @param skills            навички редактора
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює нового редактора з вказаними налаштуваннями редагування.
     *
     * @param electronicEditing чи підтримує редактор електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює нового редактора з налаштуваннями за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядок, що представляє об'єкт редактора, включаючи налаштування редагування.
     *
     * @return рядок із даними про редактора та його налаштування редагування
     */
    @Override
    public String toString() {
        String s = super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s = s + "electronic";
        else
            s = s + "paper";
        return s;
            
    }

    private boolean electronicEditing;

    /**
     * Повертає налаштування редагування редактора.
     *
     * @return true, якщо редактор підтримує електронне редагування, в іншому випадку - false
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює налаштування редагування редактора.
     *
     * @param electronic чи підтримує редактор електронне редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
