# DSA All Topics (1st Year)

Data Structures and Algorithms topics we discussed in class when I was a DIT 1A student. Every topic is a small Java program, grouped by package. The project was created with Apache NetBeans 26 (Ant project).

## Table of Contents

- [Midterm Topics](#midterm-topics)
- [Finals Topics](#finals-topics)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Requirements](#requirements)

---

## Midterm Topics

| # | Topic | Package (in `src/`) | Files |
|---|-------|---------------------|-------|
| 1 | Object-Oriented Programming | `Encapsulation`, `Inheritance`, `inheritance_sample`, `Polymorphism.abstracts`, `Abstract` | see below |
| 2 | Array: Insertion | `Insertion_Array` | `Insertion`, `insertion_specific` |
| 3 | Array: Deletion | `Deletion` | `Deletion`, `UserInputDeletion` |
| 4 | Array: Linear and Binary Search | `Search_Algorithm` | `Linear_Search`, `Binary_Search` |
| 5 | Multi-Dimensional Array | `MultiDimensional_Array` | `MultiD_arr_withVAlue`, `MultiD_Arr_wihoutValue`, `MultiD_Arr_UserInput` |
| 6 | ArrayList | `ArrayList` | `ArrayListt`, `ActivityPresent` |
| 7 | Linked List | `LinkedListt` | `SInglyLinkedListt`, `doublyLinkedList`, `circularLinkedList`, `LinkList`, `LinkList_Scanner`, `LinkedList_Import` |
| 8 | Stack | `LinkedListt` | `LinkedList_Import` (`push` / LIFO behavior of Java's `LinkedList`) |

### OOP breakdown

- **Encapsulation**: `Library`, `Main`
- **Inheritance**: `User`, `Guest`, `hasAccount`, `Main`, plus a second example in `inheritance_sample` (`Orgnism`, `Animal`, `Cat`, `Dog`, `Main`)
- **Polymorphism and abstract classes**: `Polymorphism.abstracts` (`Animal`, `Cat`, `Dog`, `Main`)
- **Abstraction**: `Abstract` (`op`, `addition`, `subtraction`, `Main`)

### Linked List variants

- Singly linked list
- Doubly linked list
- Circular linked list
- Linked list with `Scanner` user input
- Java's built-in `java.util.LinkedList` (used as a stack with `push` and as a queue with `offer`)

---

## Finals Topics

All finals programs are in the `ForFinalsz` package.

| # | Topic | Files |
|---|-------|-------|
| 1 | Bubble Sort | `BubbleSorter`, `BubbleSorterAlternative`, `BubbleSorter_Scanner` |
| 2 | Insertion Sort | `InsertionSort`, `Insertion_Sort_ME` |
| 3 | Selection Sort | `SelectionSort_Me` |
| 4 | Quick Sort | `QuickSort` |
| 5 | Merge Sort | `MergeSort` |
| 6 | Recursion | `Recursion`, `Recursion2` |
| 7 | Binary Tree | `BinaryTree_Sample` |
| 8 | Binary Search Tree | `BinarySearchTree_Sample` |

`ZxZxxTopicszxxZxZ.java` holds the finals topic list and the exam coverage notes.

### Finals exam coverage

- All sorting algorithms
- Recursion
- Binary Tree
- Binary Search Tree

### Listed in the outline but not covered in class

- Hash Table / Hash Map (no time left)
- Graphs

---

## Project Structure

```
DSA-All-Topics-1st-Year/
├── nbproject/                  NetBeans project settings
├── src/
│   ├── Topics/                 DSA.java: overview of Midterm and Finals topics
│   ├── Abstract/
│   ├── ArrayList/
│   ├── Deletion/
│   ├── Encapsulation/
│   ├── Inheritance/
│   ├── inheritance_sample/
│   ├── Polymorphism/abstracts/
│   ├── Insertion_Array/
│   ├── Search_Algorithm/
│   ├── MultiDimensional_Array/
│   ├── LinkedListt/
│   └── ForFinalsz/             Finals: sorting, recursion, trees
├── build.xml
└── manifest.mf
```

## How to Run

**NetBeans**

1. Clone the repo: `git clone https://github.com/Karumuii/DSA-All-Topics-1st-Year.git`
2. In NetBeans, choose **File > Open Project** and select the cloned folder.
3. Right-click any file with a `main` method and choose **Run File** (Shift + F6).

**Command line**

```bash
cd DSA-All-Topics-1st-Year/src
javac ForFinalsz/QuickSort.java
java ForFinalsz.QuickSort
```

Replace the package and class name with the topic you want to run.

## Requirements

- JDK 8 or newer
- Apache NetBeans (optional, any Java IDE or the command line also works)
