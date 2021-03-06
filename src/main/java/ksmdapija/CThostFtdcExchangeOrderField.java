package ksmdapija;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : kingstarapi/linux/libfiles/KSUserApiStructEx.h:1281</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("ksmdapija") 
public class CThostFtdcExchangeOrderField extends StructObject {
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(0) 
	public byte OrderPriceType() {
		return this.io.getByteField(this, 0);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u06f8\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderPriceTypeType
	 */
	@Field(0) 
	public CThostFtdcExchangeOrderField OrderPriceType(byte OrderPriceType) {
		this.io.setByteField(this, 0, OrderPriceType);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(1) 
	public byte Direction() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDirectionType
	 */
	@Field(1) 
	public CThostFtdcExchangeOrderField Direction(byte Direction) {
		this.io.setByteField(this, 1, Direction);
		return this;
	}
	/**
	 * \ufffd\ufffd\u03ff\ufffd\u01bd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcCombOffsetFlagType
	 */
	@Array({5}) 
	@Field(2) 
	public Pointer<Byte > CombOffsetFlag() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \ufffd\ufffd\ufffd\u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcCombHedgeFlagType
	 */
	@Array({5}) 
	@Field(3) 
	public Pointer<Byte > CombHedgeFlag() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public double LimitPrice() {
		return this.io.getDoubleField(this, 4);
	}
	/**
	 * \ufffd\u06f8\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(4) 
	public CThostFtdcExchangeOrderField LimitPrice(double LimitPrice) {
		this.io.setDoubleField(this, 4, LimitPrice);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public int VolumeTotalOriginal() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(5) 
	public CThostFtdcExchangeOrderField VolumeTotalOriginal(int VolumeTotalOriginal) {
		this.io.setIntField(this, 5, VolumeTotalOriginal);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(6) 
	public byte TimeCondition() {
		return this.io.getByteField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u0427\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeConditionType
	 */
	@Field(6) 
	public CThostFtdcExchangeOrderField TimeCondition(byte TimeCondition) {
		this.io.setByteField(this, 6, TimeCondition);
		return this;
	}
	/**
	 * GTD\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(7) 
	public Pointer<Byte > GTDDate() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(8) 
	public byte VolumeCondition() {
		return this.io.getByteField(this, 8);
	}
	/**
	 * \ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeConditionType
	 */
	@Field(8) 
	public CThostFtdcExchangeOrderField VolumeCondition(byte VolumeCondition) {
		this.io.setByteField(this, 8, VolumeCondition);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u027d\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public int MinVolume() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\ufffd\u0421\ufffd\u027d\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(9) 
	public CThostFtdcExchangeOrderField MinVolume(int MinVolume) {
		this.io.setIntField(this, 9, MinVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(10) 
	public byte ContingentCondition() {
		return this.io.getByteField(this, 10);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcContingentConditionType
	 */
	@Field(10) 
	public CThostFtdcExchangeOrderField ContingentCondition(byte ContingentCondition) {
		this.io.setByteField(this, 10, ContingentCondition);
		return this;
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public double StopPrice() {
		return this.io.getDoubleField(this, 11);
	}
	/**
	 * \u05b9\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcPriceType
	 */
	@Field(11) 
	public CThostFtdcExchangeOrderField StopPrice(double StopPrice) {
		this.io.setDoubleField(this, 11, StopPrice);
		return this;
	}
	/**
	 * \u01ff\u01bd\u052d\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(12) 
	public byte ForceCloseReason() {
		return this.io.getByteField(this, 12);
	}
	/**
	 * \u01ff\u01bd\u052d\ufffd\ufffd<br>
	 * C type : TThostFtdcForceCloseReasonType
	 */
	@Field(12) 
	public CThostFtdcExchangeOrderField ForceCloseReason(byte ForceCloseReason) {
		this.io.setByteField(this, 12, ForceCloseReason);
		return this;
	}
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(13) 
	public int IsAutoSuspend() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * \ufffd\u0536\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(13) 
	public CThostFtdcExchangeOrderField IsAutoSuspend(int IsAutoSuspend) {
		this.io.setIntField(this, 13, IsAutoSuspend);
		return this;
	}
	/**
	 * \u04b5\ufffd\ufffd\u052a<br>
	 * C type : TThostFtdcBusinessUnitType
	 */
	@Array({21}) 
	@Field(14) 
	public Pointer<Byte > BusinessUnit() {
		return this.io.getPointerField(this, 14);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(15) 
	public int RequestID() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRequestIDType
	 */
	@Field(15) 
	public CThostFtdcExchangeOrderField RequestID(int RequestID) {
		this.io.setIntField(this, 15, RequestID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0631\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderLocalIDType
	 */
	@Array({13}) 
	@Field(16) 
	public Pointer<Byte > OrderLocalID() {
		return this.io.getPointerField(this, 16);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeIDType
	 */
	@Array({9}) 
	@Field(17) 
	public Pointer<Byte > ExchangeID() {
		return this.io.getPointerField(this, 17);
	}
	/**
	 * \ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(18) 
	public Pointer<Byte > ParticipantID() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * \ufffd\u037b\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcClientIDType
	 */
	@Array({11}) 
	@Field(19) 
	public Pointer<Byte > ClientID() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * \ufffd\ufffd\u053c\ufffd\u06bd\ufffd\ufffd\ufffd\ufffd\ufffd\u0134\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcExchangeInstIDType
	 */
	@Array({31}) 
	@Field(20) 
	public Pointer<Byte > ExchangeInstID() {
		return this.io.getPointerField(this, 20);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(21) 
	public Pointer<Byte > TraderID() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(22) 
	public int InstallID() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * \ufffd\ufffd\u05f0\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstallIDType
	 */
	@Field(22) 
	public CThostFtdcExchangeOrderField InstallID(int InstallID) {
		this.io.setIntField(this, 22, InstallID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public byte OrderSubmitStatus() {
		return this.io.getByteField(this, 23);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u1f7b\u05f4\u032c<br>
	 * C type : TThostFtdcOrderSubmitStatusType
	 */
	@Field(23) 
	public CThostFtdcExchangeOrderField OrderSubmitStatus(byte OrderSubmitStatus) {
		this.io.setByteField(this, 23, OrderSubmitStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(24) 
	public int NotifySequence() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02be\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(24) 
	public CThostFtdcExchangeOrderField NotifySequence(int NotifySequence) {
		this.io.setIntField(this, 24, NotifySequence);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(25) 
	public Pointer<Byte > TradingDay() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(26) 
	public int SettlementID() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSettlementIDType
	 */
	@Field(26) 
	public CThostFtdcExchangeOrderField SettlementID(int SettlementID) {
		this.io.setIntField(this, 26, SettlementID);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderSysIDType
	 */
	@Array({21}) 
	@Field(27) 
	public Pointer<Byte > OrderSysID() {
		return this.io.getPointerField(this, 27);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(28) 
	public byte OrderSource() {
		return this.io.getByteField(this, 28);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0534<br>
	 * C type : TThostFtdcOrderSourceType
	 */
	@Field(28) 
	public CThostFtdcExchangeOrderField OrderSource(byte OrderSource) {
		this.io.setByteField(this, 28, OrderSource);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(29) 
	public byte OrderStatus() {
		return this.io.getByteField(this, 29);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u05f4\u032c<br>
	 * C type : TThostFtdcOrderStatusType
	 */
	@Field(29) 
	public CThostFtdcExchangeOrderField OrderStatus(byte OrderStatus) {
		this.io.setByteField(this, 29, OrderStatus);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(30) 
	public byte OrderType() {
		return this.io.getByteField(this, 30);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcOrderTypeType
	 */
	@Field(30) 
	public CThostFtdcExchangeOrderField OrderType(byte OrderType) {
		this.io.setByteField(this, 30, OrderType);
		return this;
	}
	/**
	 * \ufffd\ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(31) 
	public int VolumeTraded() {
		return this.io.getIntField(this, 31);
	}
	/**
	 * \ufffd\ufffd\u027d\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(31) 
	public CThostFtdcExchangeOrderField VolumeTraded(int VolumeTraded) {
		this.io.setIntField(this, 31, VolumeTraded);
		return this;
	}
	/**
	 * \u02a3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public int VolumeTotal() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * \u02a3\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcVolumeType
	 */
	@Field(32) 
	public CThostFtdcExchangeOrderField VolumeTotal(int VolumeTotal) {
		this.io.setIntField(this, 32, VolumeTotal);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcDateType
	 */
	@Array({9}) 
	@Field(33) 
	public Pointer<Byte > InsertDate() {
		return this.io.getPointerField(this, 33);
	}
	/**
	 * \u03af\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(34) 
	public Pointer<Byte > InsertTime() {
		return this.io.getPointerField(this, 34);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(35) 
	public Pointer<Byte > ActiveTime() {
		return this.io.getPointerField(this, 35);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(36) 
	public Pointer<Byte > SuspendTime() {
		return this.io.getPointerField(this, 36);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u07b8\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(37) 
	public Pointer<Byte > UpdateTime() {
		return this.io.getPointerField(this, 37);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u02b1\ufffd\ufffd<br>
	 * C type : TThostFtdcTimeType
	 */
	@Array({9}) 
	@Field(38) 
	public Pointer<Byte > CancelTime() {
		return this.io.getPointerField(this, 38);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\u07b8\u013d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcTraderIDType
	 */
	@Array({21}) 
	@Field(39) 
	public Pointer<Byte > ActiveTraderID() {
		return this.io.getPointerField(this, 39);
	}
	/**
	 * \ufffd\ufffd\ufffd\ufffd\ufffd\u0531\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcParticipantIDType
	 */
	@Array({11}) 
	@Field(40) 
	public Pointer<Byte > ClearingPartID() {
		return this.io.getPointerField(this, 40);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(41) 
	public int SequenceNo() {
		return this.io.getIntField(this, 41);
	}
	/**
	 * \ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcSequenceNoType
	 */
	@Field(41) 
	public CThostFtdcExchangeOrderField SequenceNo(int SequenceNo) {
		this.io.setIntField(this, 41, SequenceNo);
		return this;
	}
	public CThostFtdcExchangeOrderField() {
		super();
	}
	public CThostFtdcExchangeOrderField(Pointer pointer) {
		super(pointer);
	}
}
