package ru.yandex.qatools.allure;

import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.experimental.LifecycleListener;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 03.10.14
 */
public class MyTest extends LifecycleListener {
    @Test
    public void sampleTest() throws Exception {
        step1();
        step2();
    }

    @Step
    public void step1() {
    }

    @Step
    public void step2() {
        step3();
    }

    @Step
    public void step3() {
    }
}
