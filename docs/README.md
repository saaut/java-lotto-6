# 로또 구현 기능 목록


-----


>### 1. 구입 금액 입력
>
>---
>- [ ] 구입 금액은 1,000원 단위로 입력 받는다.
>- [ ] 1,000원으로 나누어 떨어지지 않는 경우 예외 처리한다.
>- [ ] 로또 구입 개수가 정해진다.
>
>
>### 2. 로또 발행
> 
> ---
>- [ ] 1~45 범위의 중복되지 않는 숫자 6개를 뽑는다.
>- [ ] 로또 구입 개수만큼 발행한다.
>
>### 3. 당첨 번호를 입력 받음
>
>---
>- [ ] 사용자가 당첨 숫자를 6개 입력한다.
>- [ ] 번호는 쉼표(,)를 기준으로 구분한다.
>- [ ] (+임의 추가 기능) trim()을 이용하여 띄어쓰기를 제거한다.
>- [ ] 당첨 숫자 후에는 보너스 번호를 1개 입력한다.
>
> ### 4. 당첨 내역을 출력
>
>---
>- [ ] 사용자가 구매한 로또 번호와 당첨 번호를 비교한다.
>- [ ] 당첨 내역을 출력한다.
>- [ ] 수익률을 계산하여 출력한다.
>
> ###  예외 처리
> 
> ---
>- [ ] 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
>- [ ] Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.





# 구조 설계

-----
>
>## model
>
> ---
> ### Lotto
>- Lotto 번호들을 저장한다.
>- validate() Lotto가 생성될 때, 유효한 숫자인지 검사한다.
>- getnumbers Lotto의 번호들을 get한다.
>
> ### Lottos
>- Lotto객체를 담은 List Lottos
>- Lotto의 목록을 저장한다.
>
> ### User
> - Lotto 프로그램을 이용하는 사용자를 나타낸다.
> - 유저마다 수익, 수익률, 쓴 돈이 저장된다.
> 
> ### Ranks
> - 로또의 등 수가 저장된다.
> - 등 수마다 몇 명이 해당하는지 저장된다.

>## View
>
>---
> ### InputView
> - 사용자 입력과 관련된 기능을 담당한다.
> ### OutputView
> - 사용자에게 보여지는 출력 기능을 담당한다.

>## Controller
>
>---
>
>### LottoController
>
> - Lotto의 전반적인 실행을 제어한다. 
 
>## Service
> 
> ---
> ### LottoService
> - 로또 데이터 비교, 계산 등 데이터를 처리한다. 
 
>## Validator
>
> ---
> ### Validator
> - 유효성을 검사하는 메서드의 집합