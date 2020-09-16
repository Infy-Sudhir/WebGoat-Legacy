/**
 * @id java/sysout
 * @name System out print
 * @description Finds sysout statements
 * @tags sysout
 *       statement
 * @kind problem
 * @problem.severity error
 * @precision very-high
 */

import java

from Call c, Method m
where m = c.getCallee() and
    m.hasName("println")
select c,"System.out.println are bad for performance, please aviod"
