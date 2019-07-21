/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.util.ObjectUtils;

/**
 * Simple test bean used for testing bean factories, the AOP framework etc.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @author Stephane Nicoll
 * @since 15 April 2001
 */
public class TestBean implements BeanNameAware, BeanFactoryAware, Comparable<Object> {
	private String beanName;

	private String country;

	private BeanFactory beanFactory;

	private String name;

	private String sex;

	private int age;

	private boolean jedi;

	private ITestBean spouse;

	protected ITestBean[] spouses;

	private String touchy;

	public boolean isJedi() {
		return jedi;
	}

	public void setJedi(boolean jedi) {
		this.jedi = jedi;
	}

	public ITestBean getSpouse() {
		return spouse;
	}

	public void setSpouse(ITestBean spouse) {
		this.spouse = spouse;
	}

	public ITestBean[] getSpouses() {
		return spouses;
	}

	public void setSpouses(ITestBean[] spouses) {
		this.spouses = spouses;
	}

	public String getTouchy() {
		return touchy;
	}

	public void setTouchy(String touchy) {
		this.touchy = touchy;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBeanName() {
		return beanName;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null || !(other instanceof TestBean)) {
			return false;
		}
		TestBean tb2 = (TestBean) other;
		return (ObjectUtils.nullSafeEquals(this.name, tb2.name) && this.age == tb2.age);
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public int compareTo(Object other) {
		if (this.name != null && other instanceof TestBean) {
			return this.name.compareTo(((TestBean) other).getName());
		}
		else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

}
