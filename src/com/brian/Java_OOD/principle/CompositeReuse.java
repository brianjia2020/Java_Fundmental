package com.brian.Java_OOD.principle;

/**
 * Try not to use inheritance
 * e.g. If there are two classes, A and B, B wants to use the methods inside A.
 *              1. first way is to inherit, but the coupling is too strong. B only wants to use method1, if A expands, B will also get affected
 *              2. get a method in B, method1(A a){a.operation1()}
 *              3. add an attribute in B (private A a. setter and getter) then I can use a.method()
 *              4. add an attribute and use constructor to add to B
 * All the 2,3,4 is to reduce the coupling of A and B. Do not always inherit.....there are other ways!!!!
 *
 *
 * OOD design's core part is focused on interface not implemented class, less coupling.
 */
public class CompositeReuse {

}
