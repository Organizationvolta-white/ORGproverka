
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class Laboratoric extends javax.swing.JFrame {

    int min;
    Avtori[] Oautor = new Avtori[10];
    String fileName = "";
    DefaultListModel lstdo1991 = new DefaultListModel();
    DefaultListModel lit = new DefaultListModel();
    DefaultListModel bon = new DefaultListModel();
    DefaultTableModel tm2 = new DefaultTableModel();
    DefaultTableModel tm1 = new DefaultTableModel();
    private Vector<?> vr;
    private int[] result;

    public void Task16() {
        lblOtvet16raz1.setText(""); // выводит знач
        int[] A = {2, 0, 5, 7, -9, 0};// массив со значениями А
        int[] B = {6, 8, 9, -1, 8, -5};//массив со значениями В
        lblMass16raz1.setText(Arrays.toString(A) + " "); // вычисляет исходное значение А
        lblMass116raz1.setText(Arrays.toString(B) + " "); //вычисляет исходное значение В

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= 0) { // усливие если а меньше 0, то умножается  b на 10
                B[i] = B[i] * 10;

                lblOtvet16raz1.setText(lblOtvet16raz1.getText() + " " + B[i]); // Вычисляет и выводит по правилу 
            } else {

                B[i] = 0;// либо заменяется на 0

            }
        }
    }

    public void Task41() {
        int[] November = new int[30];// массив от 1 до 30 случайных, целых чисел
        int osadkinet = 0;// переменная 
        lblDnideazosad41raz1.setText(" "); // выводит значение
        for (int i = 0; i < November.length; i++) {
            osadkinet = osadkinet + 1;
            November[i] = (int) (Math.random() * 2 + 1); // рандомит значение дней
            lblMass41raz1.setText(Arrays.toString(November) + " "); // выводит массив(цифрами)
            if (November[i] == 1) { // проверяется условие 1
                lblDnideazosad41raz1.setText(lblDnideazosad41raz1.getText() + osadkinet + " День "); // выводит дни строчкой без осадков

            }
        }
    }

    public int[] Task66() {

        int[] A = new int[15];//  массив А со случаными целыми числами от 0 до 15
        int[] B = new int[15];// массив B со случаными целыми числами от 0 до 15
        int[] C = new int[15]; // массив C со случаными целыми числами от 0 до 15

        for (int i = 0; i < 15; i++) {// цикл который рандомит числа всех массивов
            A[i] = (int) (Math.random() * 50 + 1);
            B[i] = (int) (Math.random() * 50 + 1);
            C[i] = (int) (Math.random() * 50 + 1);

        }
        lblMassa66raz1.setText(Arrays.toString(A) + " ");
        lblMassb66raz1.setText(Arrays.toString(B) + " ");
        lblMassc66raz1.setText(Arrays.toString(C) + " ");
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for (int i = 0; i < 15; i++) {// цикл для нахождения сумм всех отдельных массивов
            sumA += A[i];
            sumB += B[i];
            sumC += C[i];
        }

        int S = summMass(A);
        int V = summMass(B);
        int Ci = summMass(C);
        lblIzm66raz1.setText(" " + sumA);
        lblIzm166raz1.setText(" " + sumB);
        lblIzm266raz1.setText(" " + sumC);
        return result;
    }

    public int summMass(int[] list) { // метод вывода суммы
        int[] result = new int[list.length];//
        int summ = 0;
        for (int i = 0; i < result.length; i++) {
            summ = summ + result[i];
        }
        return summ;
    }

    public static int[] А(int[] list) { // метод выывода с каким-то значением(его нужно обозначить)
        int[] result = new int[list.length];//
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public void Task16raz2() {
        String text1 = txflKolctr16raz2.getText();
        if (text1.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, " Строка не должна быть пустой");
        } else {
            String text = txpKolctolb16raz2.getText();
            if (text.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, " столбец не должна быть пустой");
            } else {

                int[][] T = new int[5][7];// двумерный массив Т
                int m1, m2;
                double min = Double.MAX_VALUE;
                DefaultTableModel tm = (DefaultTableModel) tblOsn16raz2.getModel(); // выводит знач в табл
                int row = Integer.parseInt(txflKolctr16raz2.getText());// выводит знач row(где ты сам пишешь кол-во строк)
                int col = Integer.parseInt(txpKolctolb16raz2.getText());//выводит знач col(где ты сам пишешь кол-во столбцов)
                tm.setColumnCount(col);

                for (int i = 0; i < row; i++) {// цикл  для строк
                    Vector vr = new Vector();
                    for (int j = 0; j < col; j++) { // цикл для столбцов
                        m1 = (int) (Math.random() * 50 + 1); // рандомит числа в м1
                        m2 = (int) (Math.random() * 50 + 1); // рандомит числа м2
                        T[i][j] = Math.min(m1, m2); // находит значение м1 и м2
                        vr.add(T[i][j]);
                    }
                    tm.addRow(vr); // выводит значение(м1 и м2) в табл
                }
            }
        }
    }

    public void Task41raz2() {
        tm1 = (DefaultTableModel) tblOsn41raz2.getModel(); // выводит знач в  большую табл
        tm2 = (DefaultTableModel) tblCtrok41raz2.getModel();// выводит знач в  маленькую табл
        int[][] T = new int[8][5];// двумер. массив Т
        int col = 5;// переменная для столбцов
        int row = 8; // переменная для строк
        int d = 0;
        tm1.setColumnCount(col); // выводит значение колум
        tm2.setColumnCount(1); //выводит значение 1
        for (int i = 0; i < T.length; i++) { // цикл находящий числа( и выводящий в таблицу)
            Vector vr = new Vector();
            for (int j = 0; j < T[0].length; j++) {// цикл находящий рандомные числа
                T[i][j] = 20 + (int) (Math.random() * 20 + 1);
                vr.add(T[i][j]);
            }
            tm1.addRow(vr); //
        }
        int count = 0;
        for (int i = 0; i < T.length; i++) { // цикл для нахождения четных чисел
            for (int j = 0; j < T[0].length; j++) {
                if (T[i][j] % 2 == 0) {
                    count++;
                }
            }
            if (count < 3) { // в концоль выводит номера строк
                System.out.println("N:" + (i + 1));
            }
            for (int e = 0; e < 1; e++) { // цикл для вывождения в табл номера строк
                Vector vr = new Vector();
                d++;
                for (int t = 0; t < 8; t++) {

                    if (count < 3) {
                        vr.add(d); // выводит в таблицу номера строк
                    }
                }
                tm2.addRow(vr); // выводит занчение в табл
            }
            count = 0;
        }

    }

    public void Task16raz3() {

        String text = txtfIshod16raz3.getText();
        // String newWin = " ";
        if (txtfIshod16raz3.getText().isEmpty()) {// условие чтоб строка не была пустой
            JOptionPane.showMessageDialog(this, "Строка не должна быть пустой");
        } else {
            char[] chars = text.toCharArray();
            String resStr = " ";
            int[] array = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                array[i] = Character.getNumericValue(chars[i]);
                System.out.println(array[i]);
            }
            for (int i = 0; i < chars.length; i++) {//цикл находящий по условию
                if (array[i] % 3 == 0) {// условия на нахождения, что б числа были кратны 3
                } else { // условие(тогда)
                    resStr += chars[i];
                }

                String output = new String(chars);
                lblIazm66raz3.setText(resStr + " ");
            }

        }

    }

    public void Task41raz3() {
        lblNetslov41raz3.setVisible(false);
        if (txtIshod41raz3.getText().isEmpty()) {// условие чтоб строка не была пустой
            JOptionPane.showMessageDialog(this, "Строка не должна быть пустой");
            lblNetslov41raz3.setVisible(false);
        } else {//
            String result = txtIshod41raz3.getText();
            if (result.contains("abcd")) {// условие на чтоб буквы менялись заданом на перёд
                String res = result.replaceAll("abcd", "dcba");// метод, где меняются буквы 
                txtIzm41raz3.setText(res);// выводит знач.

            } else {
                lblNetslov41raz3.setVisible(true);

            }

        }
    }

    public void Task66raz3() {

        String text = txtfVvodctrok.getText(); // выводит знач. 
        String text1 = txtfVvodctrok2.getText();//выводит знач. 
        String text2 = txtfVvod2.getText();//выводит знач. в 
        String newWin = "";// переменная
        String newWin1 = "";//переменная
        String newWin2 = "";//переменная
        if (text.isEmpty()) {// условие чтобы строка н ебыла пустой
            JOptionPane.showMessageDialog(rootPane, " Строка не должна быть пустой");
        } else {// действие, где все бувы "с" менялись  на "о".
            if (text.contains("c")) {
                newWin = text.replace("c", "o");//
                if (text1.contains("c")) {
                    newWin1 = text1.replace("c", "o");//
                    if (text2.contains("c")) {
                        newWin2 = text2.replace("c", "o");//
                    }
                }

            }
        }
        lblIshod66raz3.setText(newWin);
        lblIzm2raz3zad2.setText(newWin1);
        lblIzm3raz3zad66.setText(newWin2);
    }

    public void Task41raz4() {

        Avtori[] Oautor = new Avtori[10]; // массив с 10 знач.

        String[] Autor = {"Михаил Булгаков", "Иван Тургенев", "Николай Гоголь", "Алексей Толстой",
            "Борис Постернак", "Михаил Шолохов",
            "Стивен Кинг  ", "Виктор Тихомиров  ", "Александр Житинский  ", "Лев Толстой"};// массив с авторами
        String[] Book = {"Мастер и Маргарита", "Ася ", "Мертвые души ",
            "Хождение по мукам ", "Доктор Живаго", "Белая гвардия ",
            "Зелёная миля ", "Любимец ", "Золото на ветру", "Война и мир "};// массив с названиями книг
        int[] Year = {1940, 1858, 1842, 1940, 1955, 1924, 1996, 1994, 1993, 1858}; // массив с годами
        for (int i = 0; i < 10; i++) { // цикл вывождения в таблицу исходные данные
            Avtori pisateley = new Avtori(Autor[i], Book[i], Year[i]);
            Oautor[i] = pisateley;
            lit.addElement((i + 1) + " " + pisateley.getAutor() + "," + pisateley.getBook() + " в " + pisateley.getYear() + " год;");
        }
        int m = Integer.MAX_VALUE;// переменная для нахождения
        for (int y = 0; y < Oautor.length; y++) { // цикл для нахождения книг издавших до 1991г
            if (1991 >= Oautor[y].getYear()) { // само условие для вывода
                m = Oautor[y].getYear();
                lstdo1991.addElement(Oautor[y].getAutor() + ":" + Oautor[y].getBook() + " в " + m + "");
            }

        }
        int min = Integer.MAX_VALUE; // переменная для нахождения минимального (чего-то)
        for (int i = 0; i < Oautor.length; i++) { // цикл, в котором чья-та книга вышла раньше других
            if (min > Oautor[i].getYear()) {
                min = Oautor[i].getYear();
                lblFamminknigraz4.setText(min + " ," + Oautor[i].getAutor());

            }
        }

        lstDannievseh41raz4.setModel(lit);
        lstAvtorido1991raz4.setModel(lstdo1991);

    }

    public Laboratoric() {
        initComponents();
        lblNetslov41raz3.setVisible(false);
        lstDannievseh41raz4.setModel(lit);
        lstAvtorido1991raz4.setModel(lstdo1991);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        lblZadanie16raz2 = new javax.swing.JLabel();
        lblMass16raz1 = new javax.swing.JLabel();
        lblMass116raz1 = new javax.swing.JLabel();
        lblOtvet16raz1 = new javax.swing.JLabel();
        btnStart16raz1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblZadanie41raz1 = new javax.swing.JLabel();
        lblDnideazosad41raz1 = new javax.swing.JLabel();
        lblMass41raz1 = new javax.swing.JLabel();
        btnStart41raz1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lblMassa66raz1 = new javax.swing.JLabel();
        lblMassb66raz1 = new javax.swing.JLabel();
        lblMassc66raz1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblZadanie66raz1 = new javax.swing.JLabel();
        lblSummmasraz166 = new javax.swing.JLabel();
        lblIzm66raz1 = new javax.swing.JLabel();
        lblIzm166raz1 = new javax.swing.JLabel();
        lblIzm266raz1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        lblzad16raz2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOsn16raz2 = new javax.swing.JTable();
        lblKolvoctrok16raz2 = new javax.swing.JLabel();
        lblKolvoctolb16raz2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txflKolctr16raz2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txpKolctolb16raz2 = new javax.swing.JTextPane();
        btnStart16raz2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        lblZadanieraz2zad41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOsn41raz2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCtrok41raz2 = new javax.swing.JTable();
        btnStart41raz2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        lblZadanie16raz3 = new javax.swing.JLabel();
        lblIshodzad16raz3 = new javax.swing.JLabel();
        lblIzmzad3raz3 = new javax.swing.JLabel();
        btnStart16raz3 = new javax.swing.JButton();
        txtfIshod16raz3 = new javax.swing.JTextField();
        lblIazm66raz3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblZadanie41raz3 = new javax.swing.JLabel();
        lblIshod41raz3 = new javax.swing.JLabel();
        lblIzm41raz3 = new javax.swing.JLabel();
        txtIshod41raz3 = new javax.swing.JTextField();
        txtIzm41raz3 = new javax.swing.JTextField();
        lblNetslov41raz3 = new javax.swing.JLabel();
        btnStart41raz3 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lblZadanie66raz3 = new javax.swing.JLabel();
        lblZnath66raz3 = new javax.swing.JLabel();
        lblIzm66raz3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtfVvodctrok = new javax.swing.JTextField();
        lblIshod66raz3 = new javax.swing.JLabel();
        txtfVvodctrok2 = new javax.swing.JTextField();
        txtfVvod2 = new javax.swing.JTextField();
        lblIzm2raz3zad2 = new javax.swing.JLabel();
        lblIzm3raz3zad66 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        lblZadraz441 = new javax.swing.JLabel();
        lblFamranchedr = new javax.swing.JLabel();
        lblAvtorraz4 = new javax.swing.JLabel();
        lblKnigraz4 = new javax.swing.JLabel();
        lblYearraz4 = new javax.swing.JLabel();
        lblFamminknigraz4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstDannievseh41raz4 = new javax.swing.JList<>();
        btnSta41raz4 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstAvtorido1991raz4 = new javax.swing.JList<>();
        lblAvt1991raz4 = new javax.swing.JLabel();
        txtfAdresrabotiraz4 = new javax.swing.JTextField();
        lblAdressvvodraz4 = new javax.swing.JLabel();
        btnSave41raz4 = new javax.swing.JButton();
        lblNamefileraz4 = new javax.swing.JLabel();
        txtfNamefileraz441 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblZadanie16raz2.setText("<html>16.Даны два одномерных массива А и В: а1, а2, ... , аn и b1, b2, ..., bn .<p> Преобразовать массив В по правилу: если аi0, то bi увеличить в 10 раз, иначе bi заменить 0 (i=1’n).</html>");

        lblMass16raz1.setText("Исходный массив А:");

        lblMass116raz1.setText("Исходный массив B:");

        lblOtvet16raz1.setText("Преобразованный массив:");

        btnStart16raz1.setText("Start");
        btnStart16raz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart16raz1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart16raz1)
                .addGap(103, 103, 103))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblOtvet16raz1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                        .addComponent(lblMass116raz1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMass16raz1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblZadanie16raz2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanie16raz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblMass16raz1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMass116raz1)
                .addGap(12, 12, 12)
                .addComponent(lblOtvet16raz1)
                .addGap(76, 76, 76)
                .addComponent(btnStart16raz1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Задание №16", jPanel6);

        lblZadanie41raz1.setText("<html>41. В массиве хранится информация о количестве осадков, выпавших за каждый день ноября. <p>Определить, в какие числа каждого месяца осадков не было.</html>");

        lblDnideazosad41raz1.setText("Дни без осадков:");

        lblMass41raz1.setText("Массив:");

        btnStart41raz1.setText("Start");
        btnStart41raz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart41raz1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZadanie41raz1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDnideazosad41raz1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMass41raz1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart41raz1)
                .addGap(70, 70, 70))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanie41raz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblDnideazosad41raz1)
                .addGap(37, 37, 37)
                .addComponent(lblMass41raz1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnStart41raz1)
                .addGap(173, 173, 173))
        );

        jTabbedPane2.addTab("Задание №41", jPanel7);

        lblMassa66raz1.setText(" исходный массив А:");

        lblMassb66raz1.setText(" исходный массив В:");

        lblMassc66raz1.setText("исходный массив С:");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblZadanie66raz1.setText("<html>66.Сформировать массивы A,B и C, содержащие по 15 целых случайных чисел. Найти сумму элементов каждого массива.<p>Создать процедуру для формирования массива и определения суммы его элементов.</html>");

        lblSummmasraz166.setText("Сумма их:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(197, 197, 197))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZadanie66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMassa66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMassb66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(lblMassc66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addComponent(lblSummmasraz166, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIzm166raz1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(lblIzm266raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIzm66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanie66raz1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIzm66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMassa66raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMassb66raz1)
                        .addComponent(lblSummmasraz166))
                    .addComponent(lblIzm166raz1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIzm266raz1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMassc66raz1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Задание №66", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Раздел 1", jPanel1);

        lblzad16raz2.setText("Составить программу для построения массива, элементы которого вычисляются по формуле аi,j=min(i,j).");

        tblOsn16raz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblOsn16raz2);

        lblKolvoctrok16raz2.setText("Введите кол-во строк");

        lblKolvoctolb16raz2.setText("Введите кол-во столбцов");

        jScrollPane2.setViewportView(txflKolctr16raz2);

        jScrollPane3.setViewportView(txpKolctolb16raz2);

        btnStart16raz2.setText("Start");
        btnStart16raz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart16raz2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblzad16raz2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(lblKolvoctrok16raz2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(lblKolvoctolb16raz2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStart16raz2)
                                .addGap(99, 99, 99))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblzad16raz2)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(lblKolvoctrok16raz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(lblKolvoctolb16raz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStart16raz2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Задание №16", jPanel9);

        lblZadanieraz2zad41.setText("<html>41.Вывести на экран матрицу 8x5, элементами которой являются целые случайные числа из интервала [20,40].<p> Определить номер строки, содержащей не более 3-х чѐтных чисел.</html>");

        tblOsn41raz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblOsn41raz2);

        tblCtrok41raz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblCtrok41raz2);

        btnStart41raz2.setText("Start");
        btnStart41raz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart41raz2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZadanieraz2zad41, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(btnStart41raz2)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanieraz2zad41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStart41raz2)))
                .addGap(95, 95, 95))
        );

        jTabbedPane3.addTab("Задание №41", jPanel10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Раздел 2", jPanel2);

        lblZadanie16raz3.setText("16.Удалить из введенной строки все цифры, кратные 3.");

        lblIshodzad16raz3.setText("Введите исходные числа:");

        lblIzmzad3raz3.setText("Изменённые числа:");

        btnStart16raz3.setText("Start");
        btnStart16raz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart16raz3ActionPerformed(evt);
            }
        });

        txtfIshod16raz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIshod16raz3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblZadanie16raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIshodzad16raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIzmzad3raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfIshod16raz3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(lblIazm66raz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnStart16raz3)
                .addGap(231, 231, 231))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanie16raz3)
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIshodzad16raz3)
                    .addComponent(txtfIshod16raz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzmzad3raz3)
                    .addComponent(lblIazm66raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnStart16raz3)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Задание №16", jPanel11);

        lblZadanie41raz3.setText("Обратить введенную строку: abcd -> dcba.");

        lblIshod41raz3.setText("Исходные буквы:");

        lblIzm41raz3.setText("Изменеённые буквы:");

        txtIshod41raz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIshod41raz3ActionPerformed(evt);
            }
        });

        lblNetslov41raz3.setText("В веденной строке неправильно написаны слова(abcd)");

        btnStart41raz3.setText("Start");
        btnStart41raz3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart41raz3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblNetslov41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStart41raz3))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblZadanie41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIshod41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIzm41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIzm41raz3)
                            .addComponent(txtIshod41raz3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadanie41raz3)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIshod41raz3)
                    .addComponent(txtIshod41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzm41raz3)
                    .addComponent(txtIzm41raz3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetslov41raz3)
                    .addComponent(btnStart41raz3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Задание №41", jPanel12);

        lblZadanie66raz3.setText("<html>66.Вводятся три строки. Зашифровать каждую из них, заменив все буквы \"с\" на \"о\"<p>(создать процедуру, заменяющую в заданной строке один символ другим).</html>");

        lblZnath66raz3.setText("Исходные слова:");

        lblIzm66raz3.setText("Изменённые строки:");

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtfVvodctrok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfVvodctrok2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblZadanie66raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(lblZnath66raz3)
                            .addGap(95, 95, 95)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfVvodctrok)
                                .addComponent(txtfVvodctrok2)
                                .addComponent(txtfVvod2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addComponent(lblIzm66raz3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblIzm3raz3zad66, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(lblIzm2raz3zad2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                            .addComponent(lblIshod66raz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblZadanie66raz3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZnath66raz3)
                    .addComponent(txtfVvodctrok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfVvodctrok2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfVvod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIzm66raz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIshod66raz3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(lblIzm2raz3zad2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIzm3raz3zad66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
        );

        jTabbedPane4.addTab("Задание №66", jPanel13);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Раздел 3", jPanel3);

        lblZadraz441.setText("<html>41.Создать файл, содержащий следующие данные: автор; название книги; год издания.<p> Вывести данные из файла на экран. Определить фамилию автора, чья книга вышла раньше других. Создать новый файл данных, содержащий сведения о книгах, издававшихся до 1991 года.</html>");

        lblFamranchedr.setText("Фамилия автора, чья книга вышла раньше других.");

        lblAvtorraz4.setText("Авторы:");

        lblKnigraz4.setText("Название книг:");

        lblYearraz4.setText("Года издания книг:");

        jScrollPane6.setViewportView(lstDannievseh41raz4);

        btnSta41raz4.setText("Start");
        btnSta41raz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSta41raz4ActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(lstAvtorido1991raz4);

        lblAvt1991raz4.setText("Авторы издавшие до 1991:");

        txtfAdresrabotiraz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfAdresrabotiraz4ActionPerformed(evt);
            }
        });

        lblAdressvvodraz4.setText("Введите адрес или путь сохранения:");

        btnSave41raz4.setText("Сохранить");
        btnSave41raz4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave41raz4ActionPerformed(evt);
            }
        });

        lblNamefileraz4.setText("Введите имя файла:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblFamranchedr, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFamminknigraz4, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblYearraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblKnigraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAvtorraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel14Layout.createSequentialGroup()
                                    .addComponent(lblAdressvvodraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                            .addComponent(txtfNamefileraz441, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel14Layout.createSequentialGroup()
                                            .addComponent(txtfAdresrabotiraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSave41raz4))))))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAvt1991raz4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblZadraz441, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblNamefileraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(392, 392, 392)
                                .addComponent(btnSta41raz4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZadraz441, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblAvtorraz4)
                                .addGap(18, 18, 18)
                                .addComponent(lblKnigraz4)
                                .addGap(18, 18, 18)
                                .addComponent(lblYearraz4))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFamranchedr)
                            .addComponent(lblFamminknigraz4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamefileraz4)
                            .addComponent(txtfNamefileraz441, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave41raz4)
                            .addComponent(lblAdressvvodraz4)
                            .addComponent(txtfAdresrabotiraz4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAvt1991raz4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSta41raz4)
                        .addGap(49, 49, 49))))
        );

        jTabbedPane5.addTab("Задание 414", jPanel14);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Раздел 4", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 902, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Раздел 5", jPanel5);

        jMenu1.setText("Файл");

        jMenuItem1.setText("Выйти");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Справка");

        jMenuItem2.setText("О программе");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStart16raz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart16raz1ActionPerformed
        Task16();
    }//GEN-LAST:event_btnStart16raz1ActionPerformed

    private void btnStart41raz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart41raz1ActionPerformed
        Task41();
    }//GEN-LAST:event_btnStart41raz1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Task66();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnStart16raz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart16raz2ActionPerformed
        Task16raz2();
    }//GEN-LAST:event_btnStart16raz2ActionPerformed

    private void btnStart41raz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart41raz2ActionPerformed
        Task41raz2();
    }//GEN-LAST:event_btnStart41raz2ActionPerformed

    private void btnStart16raz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart16raz3ActionPerformed
        Task16raz3();
    }//GEN-LAST:event_btnStart16raz3ActionPerformed

    private void txtIshod41raz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIshod41raz3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIshod41raz3ActionPerformed

    private void btnStart41raz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart41raz3ActionPerformed
        Task41raz3();
    }//GEN-LAST:event_btnStart41raz3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Task66raz3();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtfVvodctrok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfVvodctrok2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfVvodctrok2ActionPerformed

    private void btnSta41raz4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSta41raz4ActionPerformed
        Task41raz4();
    }//GEN-LAST:event_btnSta41raz4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Разработчик: Помелов А.О. 21-ИС-1 былы сделана в 2023 году   ");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtfIshod16raz3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIshod16raz3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIshod16raz3ActionPerformed

    private void btnSave41raz4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave41raz4ActionPerformed
        int m;
        if (txtfNamefileraz441.getText().isEmpty() || txtfAdresrabotiraz4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Введите иммя файла и путь куда его хотите сохранить. ");
        } else {
            fileName = txtfAdresrabotiraz4.getText() + txtfNamefileraz441.getText() + ".txt";

            //for (int i = 0; i < Oautor.length; i++) { // 
            String text = (" Авторы издавшие книги до 1991 года:" + lstdo1991);
            lstAvtorido1991raz4.setModel(lstdo1991);
            Class_vvodotvet.savefile(fileName, text);


    }//GEN-LAST:event_btnSave41raz4ActionPerformed
    }
    private void txtfAdresrabotiraz4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAdresrabotiraz4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfAdresrabotiraz4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laboratoric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratoric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratoric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratoric.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratoric().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave41raz4;
    private javax.swing.JButton btnSta41raz4;
    private javax.swing.JButton btnStart16raz1;
    private javax.swing.JButton btnStart16raz2;
    private javax.swing.JButton btnStart16raz3;
    private javax.swing.JButton btnStart41raz1;
    private javax.swing.JButton btnStart41raz2;
    private javax.swing.JButton btnStart41raz3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel lblAdressvvodraz4;
    private javax.swing.JLabel lblAvt1991raz4;
    private javax.swing.JLabel lblAvtorraz4;
    private javax.swing.JLabel lblDnideazosad41raz1;
    private javax.swing.JLabel lblFamminknigraz4;
    private javax.swing.JLabel lblFamranchedr;
    private javax.swing.JLabel lblIazm66raz3;
    private javax.swing.JLabel lblIshod41raz3;
    private javax.swing.JLabel lblIshod66raz3;
    private javax.swing.JLabel lblIshodzad16raz3;
    private javax.swing.JLabel lblIzm166raz1;
    private javax.swing.JLabel lblIzm266raz1;
    private javax.swing.JLabel lblIzm2raz3zad2;
    private javax.swing.JLabel lblIzm3raz3zad66;
    private javax.swing.JLabel lblIzm41raz3;
    private javax.swing.JLabel lblIzm66raz1;
    private javax.swing.JLabel lblIzm66raz3;
    private javax.swing.JLabel lblIzmzad3raz3;
    private javax.swing.JLabel lblKnigraz4;
    private javax.swing.JLabel lblKolvoctolb16raz2;
    private javax.swing.JLabel lblKolvoctrok16raz2;
    private javax.swing.JLabel lblMass116raz1;
    private javax.swing.JLabel lblMass16raz1;
    private javax.swing.JLabel lblMass41raz1;
    private javax.swing.JLabel lblMassa66raz1;
    private javax.swing.JLabel lblMassb66raz1;
    private javax.swing.JLabel lblMassc66raz1;
    private javax.swing.JLabel lblNamefileraz4;
    private javax.swing.JLabel lblNetslov41raz3;
    private javax.swing.JLabel lblOtvet16raz1;
    private javax.swing.JLabel lblSummmasraz166;
    private javax.swing.JLabel lblYearraz4;
    private javax.swing.JLabel lblZadanie16raz2;
    private javax.swing.JLabel lblZadanie16raz3;
    private javax.swing.JLabel lblZadanie41raz1;
    private javax.swing.JLabel lblZadanie41raz3;
    private javax.swing.JLabel lblZadanie66raz1;
    private javax.swing.JLabel lblZadanie66raz3;
    private javax.swing.JLabel lblZadanieraz2zad41;
    private javax.swing.JLabel lblZadraz441;
    private javax.swing.JLabel lblZnath66raz3;
    private javax.swing.JLabel lblzad16raz2;
    private javax.swing.JList<String> lstAvtorido1991raz4;
    private javax.swing.JList<String> lstDannievseh41raz4;
    private javax.swing.JTable tblCtrok41raz2;
    private javax.swing.JTable tblOsn16raz2;
    private javax.swing.JTable tblOsn41raz2;
    private javax.swing.JTextPane txflKolctr16raz2;
    private javax.swing.JTextPane txpKolctolb16raz2;
    private javax.swing.JTextField txtIshod41raz3;
    private javax.swing.JTextField txtIzm41raz3;
    private javax.swing.JTextField txtfAdresrabotiraz4;
    private javax.swing.JTextField txtfIshod16raz3;
    private javax.swing.JTextField txtfNamefileraz441;
    private javax.swing.JTextField txtfVvod2;
    private javax.swing.JTextField txtfVvodctrok;
    private javax.swing.JTextField txtfVvodctrok2;
    // End of variables declaration//GEN-END:variables
}
