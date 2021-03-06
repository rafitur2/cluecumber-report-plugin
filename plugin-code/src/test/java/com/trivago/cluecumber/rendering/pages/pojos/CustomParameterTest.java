package com.trivago.cluecumber.rendering.pages.pojos;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class CustomParameterTest {

    @Test
    public void isValidUrlTest() {
        CustomParameter customParameter = new CustomParameter("test", "http://www.someurl.de");
        assertThat(customParameter.isUrl(), is(true));
    }

    @Test
    public void isInvalidUrlTest() {
        CustomParameter customParameter = new CustomParameter("test", "test");
        assertThat(customParameter.isUrl(), is(false));
    }

    @Test
    public void getKeyValueTest() {
        CustomParameter customParameter = new CustomParameter("key", "value");
        assertThat(customParameter.getKey(), is("key"));
        assertThat(customParameter.getValue(), is("value"));
    }
}
