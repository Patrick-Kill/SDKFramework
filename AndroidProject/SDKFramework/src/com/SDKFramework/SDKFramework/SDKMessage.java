
package com.SDKFramework.SDKFramework;

import android.util.Log;

enum SDKMessageType {
	NUll,

	GetChannelName,

	Init, Login, Logout, UploadInfo, Pay,

	LoginSucceed, LogoutSucceed,

	/**
	 * �����5������.
	 */
	Method0, Method1, Method2, Method3, Method4;
}

public class SDKMessage {
	public SDKMessage(int type) {
		Type = type;
	}

	/**
	 * ���÷�������.
	 */
	public int Type = -1;

	// ///////////////////////Unity ���ݸ� SDK ������.

	/**
	 * �۸�.
	 */
	public float Money = -1f;
	/**
	 * ������
	 */
	public String OrderId = "";
	/**
	 * ��������ʱ��.
	 */
	public long RechargeTime = -1;
	/**
	 * ��ƷID.
	 */
	public int ProductID = -1;
	/**
	 * ��Ʒ����.
	 */
	public String ProductName = "";
	/**
	 * ��Ʒ����.
	 */
	public String ProductDescription = "";

	/**
	 * �ϴ���Ϣ���� �豸���� ע�� ���� ������ɫ ������Ϸ ���� ����VIP ע�� �˳�
	 */
	public int UploadInfoType = -1;

	/**
	 * ��ɫID.
	 */
	public long RoleId = -1;
	/**
	 * ��ɫ����.
	 */
	public String RoleName = "";
	/**
	 * ��ɫ�ȼ�.
	 */
	public int RoleLevel = -1;
	/**
	 * ��ɫְҵID.
	 */
	public int RoleProfessionalID = -1;
	/**
	 * ��ɫְҵ����.
	 */
	public String RoleProfessionalName = "";
	/**
	 * ��ɫս����.
	 */
	public int RolePower = -1;
	/**
	 * ��ɫ����ʱ��.
	 */
	public String CreateRoleTime = "";
	/**
	 * ��ɫ����ʱ��.
	 */
	public String RoleUpgradeTime = "";
	/**
	 * ʣ����ʯ.
	 */
	public int Diamond = -1;
	/**
	 * ����ID.
	 */
	public int AreaId = -1;
	/**
	 * ��������.
	 */
	public String ArenName = "";
	/**
	 * VIP�ȼ�.
	 */
	public int VIPLevel = -1;
	/**
	 * ����Id.
	 */
	public long GangID = -1;
	/**
	 * ��������.
	 */
	public String GangName = "";
	/**
	 * ��˾����.
	 */
	public String CompanyName = "";

	// ///////////////////////SDK ���ݸ� Unity ������.

	/**
	 * �û�ID.
	 */
	public String UserID = "";
	/**
	 * Token.
	 */
	public String Token = "";

	// ///////////////////////�����10������.

	public String Variable0 = "";
	public String Variable1 = "";
	public String Variable2 = "";
	public String Variable3 = "";
	public String Variable4 = "";
	public String Variable5 = "";
	public String Variable6 = "";
	public String Variable7 = "";
	public String Variable8 = "";
	public String Variable9 = "";

	public static void ShowSDKMessageInfo(SDKMessage message) {
		Log("SDKMessage : ShowSDKMessageInfo Type:" + message.Type);
		Log("SDKMessage : ShowSDKMessageInfo Money:" + message.Money);
		Log("SDKMessage : ShowSDKMessageInfo OrderId:" + message.OrderId);
		Log("SDKMessage : ShowSDKMessageInfo RechargeTime:"
				+ message.RechargeTime);
		Log("SDKMessage : ShowSDKMessageInfo ProductID:" + message.ProductID);
		Log("SDKMessage : ShowSDKMessageInfo ProductName:"
				+ message.ProductName);
		Log("SDKMessage : ShowSDKMessageInfo ProductDescription:"
				+ message.ProductDescription);
		Log("SDKMessage : ShowSDKMessageInfo UploadInfoType:"
				+ message.UploadInfoType);
		Log("SDKMessage : ShowSDKMessageInfo RoleId:" + message.RoleId);
		Log("SDKMessage : ShowSDKMessageInfo RoleName:" + message.RoleName);
		Log("SDKMessage : ShowSDKMessageInfo RoleLevel:" + message.RoleLevel);
		Log("SDKMessage : ShowSDKMessageInfo RoleProfessionalID:"
				+ message.RoleProfessionalID);
		Log("SDKMessage : ShowSDKMessageInfo RoleProfessionalName:"
				+ message.RoleProfessionalName);
		Log("SDKMessage : ShowSDKMessageInfo RolePower:" + message.RolePower);
		Log("SDKMessage : ShowSDKMessageInfo CreateRoleTime:"
				+ message.CreateRoleTime);
		Log("SDKMessage : ShowSDKMessageInfo RoleUpgradeTime:"
				+ message.RoleUpgradeTime);
		Log("SDKMessage : ShowSDKMessageInfo Diamond:" + message.Diamond);
		Log("SDKMessage : ShowSDKMessageInfo AreaId:" + message.AreaId);
		Log("SDKMessage : ShowSDKMessageInfo ArenName:" + message.ArenName);
		Log("SDKMessage : ShowSDKMessageInfo VIPLevel:" + message.VIPLevel);
		Log("SDKMessage : ShowSDKMessageInfo GangID:" + message.GangID);
		Log("SDKMessage : ShowSDKMessageInfo GangName:" + message.GangName);
		Log("SDKMessage : ShowSDKMessageInfo CompanyName:"
				+ message.CompanyName);
		Log("SDKMessage : ShowSDKMessageInfo UserID:" + message.UserID);
		Log("SDKMessage : ShowSDKMessageInfo Variable0:" + message.Variable0);
		Log("SDKMessage : ShowSDKMessageInfo Variable1:" + message.Variable1);
		Log("SDKMessage : ShowSDKMessageInfo Variable2:" + message.Variable2);
		Log("SDKMessage : ShowSDKMessageInfo Variable3:" + message.Variable3);
		Log("SDKMessage : ShowSDKMessageInfo Variable4:" + message.Variable4);
		Log("SDKMessage : ShowSDKMessageInfo Variable5:" + message.Variable5);
		Log("SDKMessage : ShowSDKMessageInfo Variable6:" + message.Variable6);
		Log("SDKMessage : ShowSDKMessageInfo Variable7:" + message.Variable7);
		Log("SDKMessage : ShowSDKMessageInfo Variable8:" + message.Variable8);
		Log("SDKMessage : ShowSDKMessageInfo Variable9:" + message.Variable9);
	}

	public static void Log(String log) {
		
		Log.i("UnityToSDK", log);
	}
}
