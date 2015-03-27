/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.badand.perf.measure;

/**
 *
 * @author abadinka <andrej.badinka@interway.sk>
 */
public interface Measure {

    /**
     * stops counting the time and returns the result
     *
     * @param methodName for logging purposes
     * @return
     */
    public long stop(String methodName);
}
