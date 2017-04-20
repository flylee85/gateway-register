/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
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
package com.aldb.service.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * ���ݷ�ҳ���
 * 
 * @author wujing
 * @param <T>
 */
public class Page<T> implements Serializable {
	private static final long serialVersionUID = -5764853545343945831L;

	/**
	 * Ĭ��ÿҳ��¼��(20)
	 */
	public static final int DEFAULT_PAGE_SIZE = 20;

	/**
	 * ���ÿҳ��¼��(1000)
	 */
	public static final int MAX_PAGE_SIZE = 1000;

	/**
	 * ��ǰ��ҳ�����ݼ�
	 */
	private List<T> list;

	/**
	 * �ܼ�¼��
	 */
	private int totalCount;

	/**
	 * ��ҳ��
	 */
	private int totalPage;

	/**
	 * ��ǰҳ
	 */
	private int pageCurrent;

	/**
	 * ÿҳ��¼��
	 */
	private int pageSize;

	/**
	 * �����ֶ�
	 */
	private String orderField;

	/**
	 * ����ʽ��asc or desc
	 */
	private String orderDirection;

	/**
	 * Ĭ�Ϲ��캯��
	 */
	public Page() {
	}

	/**
	 * ���캯��
	 * 
	 * @param totalCount
	 *            �ܼ�¼��
	 * @param totalPage
	 *            ��ҳ��
	 * @param pageCurrent
	 * @param pageSize
	 * @param list
	 */
	public Page(int totalCount, int totalPage, int pageCurrent, int pageSize, List<T> list) {
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.pageCurrent = pageCurrent;
		this.pageSize = pageSize;
		this.list = list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageCurrent() {
		return pageCurrent;
	}

	public void setPageCurrent(int pageCurrent) {
		this.pageCurrent = pageCurrent;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderDirection() {
		return orderDirection;
	}

	public void setOrderDirection(String orderDirection) {
		this.orderDirection = orderDirection;
	}

	
}
