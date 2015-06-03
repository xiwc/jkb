package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ProxyAutoregHost generated by hbm2java
 */
@Entity
@Table(name = "proxy_autoreg_host", catalog = "skycloud")
public class ProxyAutoregHost implements java.io.Serializable {

	private Long id;
	private int clock;
	private String host;
	private String listenIp;
	private int listenPort;
	private String listenDns;

	public ProxyAutoregHost() {
	}

	public ProxyAutoregHost(int clock, String host, String listenIp, int listenPort, String listenDns) {
		this.clock = clock;
		this.host = host;
		this.listenIp = listenIp;
		this.listenPort = listenPort;
		this.listenDns = listenDns;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "clock", nullable = false)
	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	@Column(name = "host", nullable = false, length = 64)
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Column(name = "listen_ip", nullable = false, length = 39)
	public String getListenIp() {
		return this.listenIp;
	}

	public void setListenIp(String listenIp) {
		this.listenIp = listenIp;
	}

	@Column(name = "listen_port", nullable = false)
	public int getListenPort() {
		return this.listenPort;
	}

	public void setListenPort(int listenPort) {
		this.listenPort = listenPort;
	}

	@Column(name = "listen_dns", nullable = false, length = 64)
	public String getListenDns() {
		return this.listenDns;
	}

	public void setListenDns(String listenDns) {
		this.listenDns = listenDns;
	}

}
