# Tree π²

![img](https://adrianmejia.com/images/tree-parts.jpg)

- κ³μΈ΅ν μλ£κ΅¬μ‘° 
- κ·Έλνμ μΌμ’ 
  <br/><br/>
- λΈλ μ’λ₯
    - μ΅μμ λΈλ : root
    - λΆλͺ¨ λΈλ(parent node)
    - μμ λΈλ(child node)  
        - leaf node : μμ λΈλκ° μλ λΈλ
        - internal node : μ λΈλκ° μλ λΈλλ₯Ό λ΄λΆ λΈλ
          <br/><br/>
- μ¬μ΄ν΄μ΄ μλ λ°©ν₯ κ·Έλνλ₯Ό λ§νλ DAG(Directed Acyclic Graph)μ ν μ’λ₯
  - κ°λ³ μμλ€μ΄ νΉμ ν λ°©ν₯μ ν₯νκ³  μμΌλ©°, μλ‘ μννμ§ μλ κ΅¬μ‘° <br/><br/>
- μ¬λ¬ λΈλκ° ν λΈλλ₯Ό κ°λ¦¬ν€μ§ μμ
    - κ° λΈλμ in-degree : Max 1 

<br/><br/>

## Tree μ’λ₯

<br/> 

### Binary Tree π©βπ¦βπ¦
λΆλͺ¨ λΈλκ° μμ λΈλλ₯Ό μ΅λ 2κ°μ©λ§ κ°κ³  μλ νΈλ¦¬  

![img](https://media.vlpt.us/images/qksud14/post/1712bcce-475f-460d-bce8-b59f913d8995/full-complete-perfect-binary-tree.jpg)

<br/>

  1. Full Binary Tree
     - μμ λΈλ 0 or 2 κ°
     - μμμ νλλ§ κ°μ§ λΈλκ° μμ
       <br/><br/>
  2. Complete Binary Tree
     - λ§μ§λ§ λ λ²¨μ μ μΈν λͺ¨λ  μλΈνΈλ¦¬μ λ λ²¨μ΄ κ°μμΌ νκ³ , λ§μ§λ§ λ λ²¨μ μΌμͺ½λΆν° μ±μμ Έ μμ΄μΌ ν¨.
       <br/><br/>
  3. Perfect Binary Tree  
     - μλ²½ν νΌλΌλ―Έλ ννλ‘, λΉκ³΅κ° μμ΄ λͺ¨λ  λΈλκ° 2κ°μ μμμ κ°κ³  μλ tree
       <br/><br/>
  4. Binary Search Tree
     - μμλΈλλ μ΅λ 2κ°
     - μΌμͺ½ μμλΈλκ° λ£¨νΈλΈλλ³΄λ€ μκ³ , μ€λ₯Έμͺ½ μμλΈλκ° λ£¨νΈλΈλλ³΄λ€ νΌ
     - μ€μμν(Inorder Traveral)μ μ μ©νλ©΄ μ€λ¦μ°¨μ μ λ ¬μ΄ λλ€.
       - μ μμν/νμμνλ λ±ν μλ―Έκ° μλ€.
       <br/><br/>
  5. skewed binary tree
     - λΈλλ€μ΄ μ λΆ ν λ°©ν₯μΌλ‘ νΈν₯λ νΈλ¦¬

<br/><br/>

### Ternary Tree
- μμ λΈλλ₯Ό 2κ° μ΄μ κ°κ³  μλ νΈλ¦¬ 
- Trie

<br/><br/><br/>


### Balanced Tree

![img](https://www.growingwiththeweb.com/images/2015/11/14/balanced-trees.svg)

- Red-Black Tree
- AVL tree

<br/>

### Unbalanced Tree
- νμͺ½μΌλ‘ μ§λμΉκ² μΉμ°μΉ Tree
- Skewed Binary Tree

<br/><br/>

## Tree Traversal

- V : Visit
- L : Go Left
- R : Go right

1. Pre-Order  : VLR
2. In-Order   : LVR
3. Post-Order : LRV
4. Level-Order
    - λ?μ λ λ²¨λΆν° μ°¨λ‘λλ‘ μν
    - λλΉ μ°μ  μμ(= breadth-first traversal)
    


