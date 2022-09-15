import {Component} from 'react';

class MyName extends Component {
    static defaultProps = {
        name: '기본이름',
    };

    render() {
        return (
            <>
                {/* jsx 내부에서 주석을 작성할 때는 이런 형식으로 주석을 작성함 */}
                <div>
                    안녕하세요! 제이름은 <b>{this.props.name}</b>입니다. {/*내부 끝까지 주석은 이런식으로 사용됨*/}
                    {/*porps 는 현재 doc의 props 를 의미*/}
                </div>
            </>
            /* 외부에서는 다시 주석을 이런식으로 답니다 */
        );
    }
}

/* export 를 통해 render 할때 dom에 뿌려줌*/
export default MyName;
