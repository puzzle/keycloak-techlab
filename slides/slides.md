# OAuth 2.0

Protokoll & Framework zur Autorisierung in Web, Mobile und Desktop Apps

<!-- .slide: class="master03" -->

---

# OAuth 2.0

Standard seit 2012

Ziel von OAuth 2.0:<br/>
Third-parties Zugriff auf Resourcen gewähren ohne Credentials zu sharen

<!-- .slide: class="master03" -->

---

# OAuth 2.0

* Basiert auf HTTP
* De facto Standard für Autorisierung im Web
* Erweiterbar
* Bekannte Implementationen: OIDC & SAML 2.0
* Definiert in [RFC 6749](https://tools.ietf.org/html/rfc6749)
* Keycloak basiert auf OAuth 2.0


<!-- .slide: class="master03" -->

---

# Der Standard enthält

* Standard Flows + Request & Response Parametern
* Konzept von Access- und Refresh-Tokens
* Rollen
* Endpoints (/auth & /token)
* Konzept von Scopes
* Extension Points


<!-- .slide: class="master03" -->

---

# Der Standard enthält/ist jedoch _nicht_

* Authentifizierungsmethode des Resource Owners
* Format von Tokens (JWT, XML, etc.)
* Authentication protocol (OIDC, Kerberos, NTLM..)


<!-- .slide: class="master03" -->

---


# Flows von OAuth 2.0

* [Authorization Code Flow](https://github.com/puzzle/keycloak-techlab/blob/master/labs/02a_oauth2-authorization-code-flow.adoc)
* [Implicit Flow](https://github.com/puzzle/keycloak-techlab/blob/master/labs/02b_oauth2-implicit-flow.adoc)
* [Client Credentials Flow](https://github.com/puzzle/keycloak-techlab/blob/master/labs/02c_oauth2-client-credentials-flow.adoc)
* [Resource Owner Credentials Flow](https://github.com/puzzle/keycloak-techlab/blob/master/labs/02d_oauth2-resource-owner-credentials-flow.adoc)


<!-- .slide: class="master03" -->

---

# OpenID connect (OIDC)

* A identity layer on top of `OAuth 2.0`
* Does not specify identification
* Introduces an `ID Token` (based on `JWT`)
* Enables federated identity (an so SSO)
* Similar to SAMLv2 (but without xml &#128525;) 

<!-- .slide: class="master03" -->

---

# Tokens

* `by-reference` or `by-value`
* Access Token & Bearer Access Token
* `Authorization: Bearer <ENCODED_TOKEN>`
* Refresh Token
* ID Token
* Json Web Token (JWT)

<!-- .slide: class="master03" -->