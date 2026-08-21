package chap02;

public class Employee {
    //底薪
    private int baseSalary;

    //奖金
    private int bonus;
    /*
     * 构造方法
     * 1.没有返回值
     * 2.方法名和类名相同
     */
    public Employee(int baseSalary,int bonus) {
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }
    //等级
    char grade;
    public int calculateSalary(char grade) {
        double rate = calculaterste(grade, true);
        return (int) (baseSalary + bonus * rate);

    }
    private double calculaterste(char grade,boolean hasprofet) {
        if(!hasprofet)
        {
            return 0;
        }
        return switch (grade) {
            case 'A' -> 1.0;
            case 'B' -> 0.8;
            case 'C' -> 0.6;
            case 'D' -> 0.4;
            default -> 0.0;
        };
    }private void setBaseSalary(int baseSalary)
    {
        if(baseSalary < 0)
        {
            throw new IllegalArgumentException("底薪不能小于0");
        }
        this.baseSalary = baseSalary;//this.baseSalary指当前对象的baseSalary，baseSalary指传入的参数
    }
    private int getBaseSalary()
    {
        return baseSalary;
    }
    private int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if(bonus < 0) {
            throw new IllegalArgumentException("奖金不能小于0");
        }
        this.bonus=bonus;
    }

}

