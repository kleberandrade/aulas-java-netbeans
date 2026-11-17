# Java Desktop Programming Classes

![Language: Java](https://img.shields.io/badge/Language-Java-555555)
![IDE: NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6)

Java desktop-interface examples developed with NetBeans for programming classes.

## Getting started

- Open `Agenda`, `Calculadora`, `Conversões`, `EightPuzzle`, `Mercado`, `TicTacToe` as an existing project in NetBeans.

- Inspect the project libraries and original course notes before using Build or Run; historical external libraries may need to be restored.

## Recorded requirements

- A JDK and NetBeans compatible with the tracked Ant project configuration.

## Repository map

- [Agenda/build.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Agenda/build.xml)
- [Agenda/nbproject/project.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Agenda/nbproject/project.xml)
- [Calculadora/build.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Calculadora/build.xml)
- [Calculadora/nbproject/project.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Calculadora/nbproject/project.xml)
- [ControleFinanceiro/build.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/ControleFinanceiro/build.xml)
- [Conversões/build.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Convers%C3%B5es/build.xml)
- [Conversões/nbproject/project.xml](https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Convers%C3%B5es/nbproject/project.xml)

## Validation status

This update documents the tracked source and project metadata. It does not certify a successful build, device test or compatibility with a current toolchain. Follow any project-specific validation instructions in the original material.

## License and attribution

No standalone repository-wide license file was identified in this review. Preserve the original credits and any component-specific licenses; this documentation update grants no additional rights.

---

## Original project material

# Eletiva - Linguagem de Programação III - Linguagem JAVA

Disciplina do segundo semestre do curso de Análise e Desenvolvimento de Sistemas na [Faculdade de Tecnologia de Americana](http://www.fatec.edu.br/). Todas as aulas são baseadas em pequenos projetos de telas funcionais.

### Ferramentas utilizadas durante as aulas

- [Netbeans + JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk-netbeans-jsp-3413153-ptb.html)
- [Icones](https://www.iconsdb.com/white-icons/)
- [Paleta de Cores](https://flatuicolors.com/)
- [JCalendar](https://toedter.com/jcalendar/)
- [JFreeChart](http://www.jfree.org/jfreechart/) para geração de gráficos
- [RXTXComm](http://jlog.org/rxtx.html) para comunicação com o Arduino pela porta Serial
- [JasperReport](https://community.jaspersoft.com/project/jasperreports-library) para criar PDFs
- [JBarcodeBean](https://sourceforge.net/projects/jbarcodebean/files/jbarcodebean/1.2.0/)

## Projeto 1 - Calculadora

- **Novos componentes:** JFrame, JPanel, JLabel, JTextField, JButton

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_01.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_01.png" height="300"/>
</p>

## Projeto 2 - Jogo da Velha (Tic Tac Toe)

- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_02.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_02.png" height="300"/>
</p>

## Projeto 3 - Conversões

- **Novos componentes:** JTabbedPane, JRadioButton, ButtonGroup
- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton

<p align="center">6
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_03.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_03.png" height="300"/>
</p>

## Projeto 4 - Puzzle 8

- **Novos componentes:** JMenuBar, JMenu, JMenuItem, Separator
- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_04.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_04.png" height="300"/>
</p>

## Projeto 5 - Agenda

- **Novos componentes:** JChooserDate (JCalendar), JFormattedTextField, JTable, JComboBox
- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_05.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_05.png" height="300"/>
</p>

## Projeto 6 - Caixa de Mercado

- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton, JFormattedTextField, JTable, JComboBox

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_06.jpg" height="250"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_06.png" height="250"/>
</p>

## Projeto 7 - Quiz

- **Novos componentes:** JTextArea, GridLayout
- **Componentes:** JFrame, JPanel, JLabel, JButton
- **Classes:** ArrayList, Collections, Scanner, File

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_07.png" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_07.png" height="300"/>
</p>

## Projeto 8 - Média e Desvio Padrão

- **Novos componentes:** JList, JFreeChart, GridLayout
- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton
- **Classes:** ArrayList, Collections

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_08.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_08.png" height="300"/>
</p>

## Projeto 9 - Controle Financeiro

- **Componentes:** JFrame, JPanel, JLabel, JTextField, JComboBox, JButton, JList, JFreeChart, GridLayout
- **Classes:** ArrayList, Collections

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_09.png" height="300"/>
</p>

## Projeto 10 - Sistema de Empréstimo de Objetos Pessoais

- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton
- **Classes:**

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_10.png" height="300"/>
</p>

## Projeto 11 - Sistema de Estacionamento (Código de Barras e Impressora)

- **Componentes:** JFrame, JPanel, JLabel, JTextField, JButton
- **Classes:** 

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_11.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_11.png" height="300"/>
</p>

## Projeto 12 - Estação Meteorológica

- **Componentes:** JFrame, JPanel, JTextField, JButton
- **Classes:** SerialPort, OutputStream, InputStream

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_12.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_12.png" height="300"/>
</p>

## Projeto 13 - Jogo da Forca por Comando de Voz

- **Novos componentes:** 
- **Componentes:** 
- **Classes:** ArrayList, Collections, Scanner, File

<p align="center">
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/sketch_aula_12.jpg" height="300"/>
  <img src="https://github.com/kleberandrade/aulas-java-netbeans/blob/master/Imagens/resultado_aula_12.png" height="300"/>
</p>

Licença
----

    Copyright 2018 Kleber de Oliveira Andrade
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
