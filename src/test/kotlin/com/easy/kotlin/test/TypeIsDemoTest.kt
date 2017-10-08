package com.easy.kotlin.test

import com.easy.kotlin.getLength
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by lovememo on 17-10-8.
 */

@RunWith(JUnit4::class)
class TypeIsDemoTest {
    @Test
    fun testGetLength() {
        val obj = "abcdefg"
        val len = getLength(obj)
        Assert.assertTrue(7 == len)

        val obj2: Any = Any()
        getLength(obj2)
    }
}