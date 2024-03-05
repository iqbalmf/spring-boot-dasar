package net.iqbalfauzan.belajarspringdasar.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.belajarspringdasar.data.cyclic
 */
@Data
@AllArgsConstructor
public class CyclicA {
    private CyclicB cyclicB;
}
