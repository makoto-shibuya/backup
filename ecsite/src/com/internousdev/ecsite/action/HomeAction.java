package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面へ遷移します。
	 *
	 * @return SUCCSESS
	 */
	public String execute() {
		String result = "login";
		if (session.containsKey("id")) {
			// アイテム情報を取得

			List<BuyItemDTO> buyItemDTOList= new ArrayList<BuyItemDTO>();
			ListIterator<BuyItemDTO> iterator = buyItemDTOList.listIterator();
			int i=0;
			while(iterator.hasNext()){
			session.put("id", buyItemDTOList.get(i).getId());
			session.put("buyItem_name", buyItemDTOList.get(i).getItemName());
			session.put("buyItem_price", buyItemDTOList.get(i).getItemPrice());
			i++;
			}
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public void setsession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getsession() {
		return this.session;
	}
}