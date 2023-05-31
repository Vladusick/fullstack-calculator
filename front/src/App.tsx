import { useState } from "react";

// todo
// добавить типизицию, дженерики, разбить на компоненты, сделать полноценный калькулятор, обработать ексепшены
// вынести логику с запросами в другой компонент
// добавить стили
// исправить деление на ноль
// добавить лоадер

function App() {

  type Result = {
    numberA: number,
    numberB: number,
    operationName: string,
    result: number
  }

  const [numberA, setNumberA] = useState(0);
  const [numberB, setNumberB] = useState(0);
  const [result, setResult] = useState<Result>({
    numberA: 0,
    numberB: 0,
    operationName: '',
    result: 0
  });

  const url = 'http://localhost:8080/app/api/v1/';

  const additionHandler = async () => {
    await fetch(url + `add?a=${numberA}&b=${numberB}`)
      .then(response => response.json())
      .then(data => setResult(data)
      )
    setNumberA(0)
    setNumberB(0)
  }

  const subtractionHandler = async () => {
    await fetch(url + `sub?a=${numberA}&b=${numberB}`)
      .then(response => response.json())
      .then(data => setResult(data)
      )
    setNumberA(0)
    setNumberB(0)
  }

  const multiplicationHandler = async () => {
    await fetch(url + `mul?a=${numberA}&b=${numberB}`)
      .then(response => response.json())
      .then(data => setResult(data)
      )
    setNumberA(0)
    setNumberB(0)
  }

  const divisionHandler = async () => {
    await fetch(url + `div?a=${numberA}&b=${numberB}`)
      .then(response => response.json())
      .then(data => setResult(data)
      )
    setNumberA(0)
    setNumberB(0)
  }

  return (
    <div className="App">
      <h3>
        Калькулятор на 2 числа
      </h3>
      Число А:
      <input type="number" value={numberA} onChange={event => setNumberA(Number(event.target.value))} />
      <br />
      Число B:
      <input type="number" value={numberB} onChange={event => setNumberB(Number(event.target.value))} />
      <br />
      Операция:
      <button onClick={additionHandler}>+</button>
      <button onClick={subtractionHandler}>-</button>
      <button onClick={multiplicationHandler}>*</button>
      <button onClick={divisionHandler}>/</button>
      <p>Результат: {result.result}</p>
    </div>
  );
}

export default App;
