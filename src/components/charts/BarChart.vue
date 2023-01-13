<script lang="ts">
import {
    Chart as ChartJS,
    Title,
    Tooltip,
    Legend,
    BarElement,
    CategoryScale,
    LinearScale
} from 'chart.js'
import { Bar } from 'vue-chartjs'

ChartJS.register(CategoryScale, LinearScale, BarElement, Title, Tooltip, Legend)

ChartJS.defaults.color = "#FFFFFF"

export default {
    name: 'BarChart',
    components: {
        Bar
    },
    data() {
        return {
            data: {
                labels: ['January', 'February', 'March'],
                datasets: [
                    {
                        label: 'Hello', 
                        data: [40, 20, 12],
                        backgroundColor: ['#41B883', '#E46651', '#00D8FF', '#DD1B16']
                    }
                ]
            },
            options: {
                responsive: true,
                aspectRatio: 1 | 1 
            }
        }
    }
}
</script>

<template>
    <Bar :data="data" :options="options" />
</template>